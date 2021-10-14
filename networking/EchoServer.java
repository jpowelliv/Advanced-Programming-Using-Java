
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * Joseph Powell IV
 * Networking Code CIS 315
 * EchoServer file reader
 * @jpowelliv
 * 220200418
 **/
public class EchoServer {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(2222);
        Socket clientSocket = serverSocket.accept();

        PrintWriter out = new PrintWriter(
                clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        clientSocket.getInputStream()));
        out.println("connection made");

        String inputLine = null;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            if (inputLine.equals("bye bye")) {
                break;
            }
            out.println(inputLine);
        }
        out.println("bye bye");

        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }

}
