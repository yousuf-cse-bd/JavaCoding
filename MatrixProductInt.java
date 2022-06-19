import java.util.Scanner;

public class MatrixProductInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aMatRow, aMatCol, bMatRow, bMatCol, i, j, k;
        // Operation for first matrix
        System.out.print("Enter Row Value for Matrix A: ");
        aMatRow = scanner.nextInt();

        System.out.print("Enter Column Vlaue for Matix A: ");
        aMatCol = scanner.nextInt();

        int[][] A = new int[aMatCol][aMatCol];
        System.out.println("Enter All Matrix Element Below:");
        for (i = 0; i < aMatRow; i++) {
            for (j = 0; j < aMatCol; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        /// Operation for second matrix
        System.out.print("\nEnter Row Value for Matrix B: ");
        bMatRow = scanner.nextInt();

        System.out.print("Enter Column Vlaue for Matix B: ");
        bMatCol = scanner.nextInt();
        int[][] B = new int[bMatRow][bMatCol];
        System.out.println("Enter All Matrix Element Below:");
        for (i = 0; i < bMatRow; i++) {
            for (j = 0; j < bMatCol; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        /// logic Implemented
        if (aMatCol == bMatRow) {
            int sum = 0;
            int[][] AxB = new int[aMatRow][bMatCol];
            for (i = 0; i < aMatRow; i++) {
                for (j = 0; j < bMatCol; j++) {
                    for (k = 0; k < bMatRow; k++) {
                        sum += A[i][k] * B[k][j];
                    }
                    AxB[i][j] = sum;
                    sum = 0;
                }
            }

            /// Result
            System.out.println("The Product of Matix:");
            for (i = 0; i < aMatRow; i++) {
                for (j = 0; j < bMatCol; j++) {
                    System.err.print(AxB[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Matrix product Not Possible...!");
            System.out.println("First Matrix Column and Second Matrix Row Alaways Equals.");
        }
        scanner.close();
    }
}