import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        System.out.println("***MyServer Machine is Running***");
        while (true) {
            try{
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            String str = (String)din.readUTF();
            System.out.println("The Messeage from Client: "+str);
            s.close();
            ss.close();

            Socket s1 = new Socket("localhost", 6000);
            DataOutputStream dout = new DataOutputStream(s1.getOutputStream());
            dout.writeUTF("Your Messeage was Recieved");
            dout.flush();
            s1.close();
            }
            catch(Exception e){
                System.out.println(e);
            }  
        }   

    }
}
