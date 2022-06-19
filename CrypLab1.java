public class CrypLab1 {

    public static void main(String[] args) {
        
        String myName = "MUHAMMADYOUSUFALI";
        char[] ch1 = myName.toCharArray();
        System.out.print("\nEncrypted Data: ");
        for(int i = 0; i<myName.length(); i++){
            int tmp = (int)ch1[i];
            tmp = tmp - 1;
            char ch = (char)tmp;
            System.out.print(ch);
        }
    }
    
}
