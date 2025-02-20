import java.net.*;
import java.io.*;
 
public class TcpServer {
    public static void main(String args[])  throws IOException {
    
        ServerSocket ss = new ServerSocket(9090);
        System.out.println("Server is running and waiting for client connection!.");

        Socket s = ss.accept();
        System.out.println(" Client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        String message = in. readLine();
        System.out.println("Client says: " + message);


        out.println("Message recevied by the server.");
        s.close();
        ss.close();
    }    
}
