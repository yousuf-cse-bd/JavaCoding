import java.util.Scanner;

public class BinarySearch {

    static Scanner scanner = new Scanner(System.in);

    static int binarySearch(int A[]) {
        int value, mid, left, right;
        left = 0;
        right = A.length - 1;

        System.out.print("\nEnter the Your Value Here: ");
        value = scanner.nextInt();

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (A[mid] == value) {
                return A[mid]; //With Value
            } else if (A[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.print("Enter Nth Value Here: ");
        int n = scanner.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            System.out.print("Index: " + i + "\tItme = ");
            A[i] = scanner.nextInt();
        }

        Arrays.sort(A); /// Sorting Operation

        for (int x : A) {
            System.out.println(x);
        }

        int result = binarySearch(A);

        if (result == -1) {
            System.out.println("Not Found...!");
        } else {
            System.out.println("Found at Index & Value: " + result);
        }
    }
}