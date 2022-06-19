public class TertiaryOperator {
    public static void main(String[] args) {
        
        int num = 9;
        String evenOdd = num % 2 == 0? "Even":"Odd";

        System.out.println(num +" is "+evenOdd);

        num = num % 2 == 0 ? num + 1: num +2;
        System.out.println(num);
        
    }
}
