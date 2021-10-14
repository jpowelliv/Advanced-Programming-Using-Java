


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * Joseph Powell IV
 * Networking Code CIS 315
 * Client file reader
 * @jpowelliv
 * 20200418
 **/
public class Client {


	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("localhost", 1111);
		
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		
		String fromServ = in.readLine();
		System.out.println(fromServ);

		out.close();
		in.close();
		socket.close();
	}

}
