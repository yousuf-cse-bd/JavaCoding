import java.util.Random;
import java.util.Scanner;

/****
 * Mono Alphabetic Cipher
 * 
 * @Autor: MuhammadYousufAli
 * @Since: 9th February 2021
 */

public class MonoAlpabetic {

    static int value = 0;

    static int player_1() {
        Random random = new Random();
        value = random.nextInt(6);
        return value;
    }

    static int player_2() {
        Random random = new Random();
        value = random.nextInt(6);
        return value;
    }

    public static void main(String[] args) {

        int firstPlayerSum = 0;
        int secondtPlayerSum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int num = player_1();
            firstPlayerSum += num;
    
            System.out.println(firstPlayerSum);
        }
        

        scanner.close();
    }
}