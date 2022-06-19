public class GCD_LCM {
    public static void main(String[] args) {
        
        int num1,num2, rem, n1,n2;

        num1 = 30;
        num2 = 60;

        n1 = num1;
        n2 = num2;

        while(n2 != 0){
            rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n1;
        System.err.println("GCD: "+gcd);

        int lcm = (num1 * num2)/gcd;

        System.err.println("LCM: "+lcm);
    }
}
