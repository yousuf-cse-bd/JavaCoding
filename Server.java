///Java Socket Programming(Server)

import java.io.DataInputStream;
import java.net.*;
public class Server {

    public static void main(String[] args) throws Exception {
        
       ServerSocket ss = new ServerSocket(6000);
       Socket s = ss.accept();
       DataInputStream dis = new DataInputStream(s.getInputStream());
       String str =  (String)dis.readUTF();
       System.out.println("The messege from client is: "+str);
       ss.close();
       s.close();

    }
    
}
