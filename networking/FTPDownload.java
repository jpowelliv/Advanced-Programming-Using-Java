

import java.io.*;
import java.net.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * Joseph Powell IV
 * Networking Code CIS 315
 * FTPDowload file downloader
 * @jpowelliv
 * 220200418
 **/
public class FTPDownload {

	public static void main(String[] args) throws Exception {
		// get connection to server
		URL url = new URL("ftp://ftp.cs.brown.edu/pub/fix.tar.Z");

		URLConnection exe = url.openConnection();

		BufferedInputStream in = new BufferedInputStream(exe.getInputStream());
		FileOutputStream out = new FileOutputStream("C:\\Users\\josh_\\Desktop\\fix.tar.Z");

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
