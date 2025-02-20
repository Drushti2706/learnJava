import java .net.*;
import java.io.*;

public class Tcpclient {
    public static void main(String args[]) throws  IOException {
        try
        {
            Socket s = new Socket("localhost",9090);
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

            out.println("Hello from client!");
            String response = in. readLine();
            System.out.println("Server says:" + response);

            s.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }  
}
