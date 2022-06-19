import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        System.out.println("***MyClient Machine is Running***");
        try{
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.print("Enter a Messeage Here: ");
            Scanner sc = new Scanner(System.in);
            String messeage = new String();
            messeage = sc.nextLine();
            dout.writeUTF(messeage);
            dout.flush();
            s.close();

            ServerSocket ss = new ServerSocket(6000);
            Socket s1 = ss.accept();
            DataInputStream din = new DataInputStream(s1.getInputStream());
            String str = (String)din.readUTF();
            System.out.println("The Messeage from Server: "+str);
            s.close();
            ss.close();
            sc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
