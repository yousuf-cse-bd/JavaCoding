// import java.io.IOException;
// import java.io.OutputStream;
// import java.net.InetSocketAddress;

// import com.sun.net.httpserver.HttpContext;
// import com.sun.net.httpserver.HttpExchange;
// import com.sun.net.httpserver.HttpServer;

import com.sun.net.httpserver.*;
import java.net.InetSocketAddress;
import java.io.*;

public class SimpleHttpServer {
    public static void main(String[] args) throws IOException{

        HttpServer server = HttpServer.create(new InetSocketAddress(8500), 0);
        HttpContext context = server.createContext("/");
        context.setHandler(SimpleHttpServer::handleRequest());
        server.start();
        
    }

    private static void handleReq(HttpExchange exchange) throws IOException{
        String string = "This is a Server.";
        exchange.sendResponseHeaders(200, string.getBytes().length);
        OutputStream oStream = exchange.getResponseBody();
        oStream.write(string.getBytes());
        oStream.close();
    }
}
