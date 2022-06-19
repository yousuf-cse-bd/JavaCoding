import java.util.Scanner;

/*****
 * Program: Mini Max Sum
 * 
 * @Author: MuhammadYousufAli
 * @Since: 20 February 2021
 */

public class MiniMaxSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        System.out.println(min);
        // long sum = 0, number = 0;
        // for (int i = 1; i <= 5; i++) {
        //     number = input.nextLong();
        //     sum += number;

        //     max = Math.max(max, number);
        //     min = Math.min(min, number);

        // }
        // System.out.println((sum - max)+" "+(sum - min));
        input.close();
    }
}