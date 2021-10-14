import java.io.*;
import java.io.IOException;
import java.net.*;
/**
 * Joseph Powell IV
 * Networking Code CIS 315
 * this file is the web task from final thoughts
 * @jpowelliv
 * 220200418
 **/
public class WebServer {

	public WebServer(Socket clientSocket) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket (80);
			while(true) {
				Socket clientSocket = serverSocket.accept();
				//web task
				Thread thread = new Thread((Runnable) new WebServer(clientSocket));
				thread.start();
			System.out.print("connection made I think");
			}
		}finally {
			serverSocket.close();
		}
	}
}
