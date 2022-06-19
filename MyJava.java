import java.util.Scanner;


public class MyJava{

    public static void main(String[] args) {

        
        System.out.println(Math.PI);
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.print("Enter a Char: ");
        ch = scanner.next().charAt(0);
        System.out.println(ch);
        
        for(int i = 0; i<=10; i++){
            System.out.println(i);
        }

        scanner.close();
    }
}