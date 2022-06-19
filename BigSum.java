import java.util.Scanner;

public class BigSum{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long arr[] = new long[m];
        long sum = 0;

        for(int i = 0;i<n ;i++){
            for(int j = 0;j<m ;j++){
                arr[j] = scanner.nextLong();
                sum = sum + arr[j];
            }
        }

        System.out.println(sum);
        scanner.close();

    }
}