import java.util.Random;

public class RandomString{
    public static void main(String[] args) {
        
       String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       StringBuilder sb = new StringBuilder();

       Random rand = new Random();

       for(int i = 0; i<alphabet.length(); i++){
            int index = rand.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);

            sb.append(randomChar);
       }

       String randomString = sb.toString();
       System.out.println(randomString);
    }
}