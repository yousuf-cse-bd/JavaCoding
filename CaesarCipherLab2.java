///Only Uppercase
import java.util.Scanner;

public class CaesarCipherLab2 {
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String plainText, int shiftKey) {
        plainText = plainText.toUpperCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public static String decrypt(String cipherText, int shiftKey) {
        cipherText = cipherText.toUpperCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++) {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0) {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        System.out.print("Enter the String for Encryption: ");
        String message = new String();
        message = sc.nextLine();
        System.out.print("Enter the Key: ");
        key = sc.nextInt();
        System.out.println("\nEncrypted: " + encrypt(message, key));
        System.out.println("Decryptef: " + decrypt(encrypt(message, key), key));
        sc.close();
    }
}