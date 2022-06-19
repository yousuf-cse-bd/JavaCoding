import java.util.Scanner;

public class GradeSolove {

    public static void main(String[] args) {

        int i, testCase, marks;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Testcase value:");
        testCase = scanner.nextInt();

        for (i = 1; i <= testCase; i++) {
            System.out.print("\nEnter Your Marks: ");
            marks = scanner.nextInt();

            if (marks < 38) {
                System.out.println(marks);
            } else if ((marks + 2) % 5 == 0 || (marks + 1) % 5 == 0) {
                marks = ((marks + 2) % 5 == 0) ? marks + 2 : marks + 1;
                System.out.println(marks);
            } else {
                System.out.println(marks);
            }
        }

        scanner.close();
    }

}
