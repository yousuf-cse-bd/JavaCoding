public class MonthDays {
    public static void main(String... s) {

        int n, m, d;
        n = Integer.parseInt(s[0]);

        m = n / 30;
        d = n % 30;

        System.out.println(n + "days" + "=" + m + "months" + " and " + d + " days");
    }
}
