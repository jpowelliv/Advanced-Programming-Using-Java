

import java.io.*;
import java.net.*;
import java.io.IOException;
/**
 * Joseph Powell IV
 * Networking Code CIS 315
 * upload file
 * @jpowelliv
 * 220200418
 **/
public class Upload {

	public static void main(String[] args) throws IOException {
		// get connection to server
				URL url = new URL("ftp://ftp.cs.brown.edu/pub/fix.tar.Z");
				
				URLConnection con = url.openConnection();
				
				FileInputStream in = new FileInputStream("C:\\Users\\josh_\\Desktop\\garbage.bin");
				BufferedOutputStream out = new BufferedOutputStream(con.getOutputStream());
				
				// read file bytes and write to output file
				int i = 0;
				byte[] bytesIn = new byte[1024];
				
				while((i = in.read(bytesIn)) >= 0) {
					out.write(bytesIn, 0, i);
				}
			
				// close connection
				in.close();
				out.close();
	}

}
