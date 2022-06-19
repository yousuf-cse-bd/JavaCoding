
/*****
 * @Problem: Grading Student
 * @Author: Muhammad Yousuf Ali
 * @Since: 01st March 2021
 */

import java.util.Scanner;

public class HR_GradingStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        for (int i = 1; i <= testCase; i++) {
            int marks = scanner.nextInt();
            int tmp;
            if (marks > 35 && marks <= 40) {
                tmp = 40 - marks;
                if (tmp == 2 || tmp == 1) {
                    marks += tmp;
                    System.out.println(marks);
                } else {
                    System.out.println(marks);
                }
            }
            if (marks > 40 && marks <= 45) {
                tmp = 45 - marks;
                if (tmp == 2 || tmp == 1) {
                    marks += tmp;
                    System.out.println(marks);
                } else {
                    System.out.println(marks);
                }
            }
            if (marks > 45 && marks <= 50) {
                tmp = 50 - marks;
                if (tmp == 2 || tmp == 1) {
                    marks += tmp;
                    System.out.println(marks);
                } else {
                    System.out.println(marks);
                }
            }
            if (marks > 50 && marks <= 55) {
                tmp = 55 - marks;
                if (tmp == 2 || tmp == 1) {
                    marks += tmp;
                    System.out.println(marks);
                } else {
                    System.out.println(marks);
                }
            }
            if (marks > 55 && marks <= 60) {
                tmp = 60 - marks;
                if (tmp == 2 || tmp == 1) {
                    marks += tmp;
                    System.out.println(marks);
                } else {
                    System.out.println(marks);
                }
            }
            if (marks > 60 && marks <= 65) {
                tmp = 65 - marks;
                if (tmp == 2 || tmp == 1) {
                    marks += tmp;
                    System.out.println(marks);
                } else {
                    System.out.println(marks);
                }
            }
            if (marks > 65 && marks <= 70) {
                tmp = 70 - marks;
                if (tmp == 2 || tmp == 1) {
                    marks += tmp;
                    System.out.println(marks);
                } else {
                    System.out.println(marks);
                }
            }
            if (marks > 70 && marks <= 75) {
                tmp = 75 - marks;
                if (tmp == 2 || tmp == 1) {
                    marks += tmp;
                    System.out.println(marks);
                } else {
                    System.out.println(marks);
                }
            }
            if (marks > 75 && marks <= 80) {
                tmp = 80 - marks;
                if (tmp == 2 || tmp == 1) {
                    marks += tmp;
                    System.out.println(marks);
                } else {
                    System.out.println(marks);
                }
            }
           if(marks<=35){
            System.out.println(marks);
           }
           if(marks > 80 && marks <=100){
               System.out.println(marks);
           }
        }
        scanner.close();

    }
}
