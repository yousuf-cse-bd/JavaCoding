
/*****
 * Time Conversion
 * @Author: Muhammad Yousuf Ali
 * @Since: 01st March 2021 
 */
import java.util.Scanner;

public class HR_TimeConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String time = scanner.next(); ///07:45:00PM
        String listTime[] = time.split(":");
        String hour = listTime[0];
        String minutes = listTime[1];
        String seconds = listTime[2].substring(0, 2);
        String caser = listTime[2].substring(2, 4);

        if (caser.equals("AM") && hour.equals("12")) {
            // if (hour.equals("12"))
                hour = "00";
            System.out.println(hour + ":" + minutes + ":" + seconds);
        } else {
            if (!hour.equals("12")) {
                int h = Integer.parseInt(hour);
                h = h + 12;
                hour = "" + h;
            }
            System.out.println(hour + ":" + minutes + ":" + seconds);
        }

        scanner.close();
    }
}