import java.util.Scanner;

public class HR_GradeSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int marks, testCase, i;
        testCase = scanner.nextInt();

        for(i = 1; i <= testCase; i++){
            marks = scanner.nextInt();

            if(marks>=38 && marks % 5 >=3){
             marks += 5 - marks % 5;
            }
            System.out.println(marks);
        }


        scanner.close();
    }
    
}
