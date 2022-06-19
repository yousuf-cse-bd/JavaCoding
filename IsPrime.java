public class IsPrime {

    static boolean isPrime(int n) {
        short flag = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
            }
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }
}
