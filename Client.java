import java.io.DataOutputStream;
import java.net.Socket;

///Java Socket Programming(Client)
public class Client {

    public static void main(String[] args) throws Exception {
        
        Socket s = new Socket("localhost", 6000);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("I am Client 1");
        dout.flush();
        s.close();
    }
}
