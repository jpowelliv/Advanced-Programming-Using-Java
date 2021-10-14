

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * Joseph Powell IV
 * Networking Code CIS 315
 * server file
 * @jpowelliv
 * 220200418
 **/
public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(1111);
        Socket clientSocket = serverSocket.accept();

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        out.println(" yeah connection made");

        out.close();
        clientSocket.close();
        serverSocket.close();
    }
}
