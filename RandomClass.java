import java.util.Random;

public class RandomClass {
    
    public static void main(String[] args) {
        
        Random random = new Random();

        System.out.println(random);
        
        int n = random.nextInt();
        System.out.println(n);
       
    }
}
