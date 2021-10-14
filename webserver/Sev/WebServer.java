package Sev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * Joseph E Powell IV
 * CIS 315
 * MultiThreaded Web Server
 * 
 * jpowelliv 
 * 20200411
 **/
public class WebServer implements Runnable {
	public static int sevCount = 5;

	public WebServer(int users) {
		for (int i = 0; i < users; i++) {
			(new Thread(this, "Browser " + i)).start();
		}
	}

	public static void main(String args[]) {
		new WebServer(3);
		System.out.println("main thread finished");
	}

	@Override
	public void run() {
		System.out.println("Start of thread" + Thread.currentThread().getName());
		for (int i = 0; i < 6; i++) {
			try {
				int pageType = (int) (Math.random() * 4);

				switch (pageType) {
				// HTML(1/2 sec or 500 ms)
				case 1:
					System.out.println("HTML page for "+ Thread.currentThread().getName());
					PrintFile("helloHtml.html");
					Thread.sleep(1000);
					break;
				// case: js
				case 2:
					System.out.println("JavaScript page for "+ Thread.currentThread().getName());
					PrintFile("jsPage.html");
					Thread.sleep(2000);
					break;
				// case: uJs
				case 3:
					System.out.println("Java server page for "+ Thread.currentThread().getName());
					PrintFile("ujsPage.html");
					Thread.sleep(3000);
					break;
				// case: db
				case 4:
					System.out.println("Database generated page for "+ Thread.currentThread().getName());
					PrintFile("dbPage.html");
					Thread.sleep(4000);
					break;
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			System.out.println("thread Ending " + Thread.currentThread().getName());
	}
	
		public static void PrintFile(String File) {
			String fileToRead = File;
			 
			try {
			    BufferedReader lineReader = new BufferedReader(new FileReader(fileToRead));
			    String lineText = null;
			 
			    while ((lineText = lineReader.readLine()) != null) {
			        System.out.println(lineText);
			    }
			 
			    lineReader.close();
			} catch (IOException ex) {
			    System.err.println(ex);
			}
			
		
		}
}

 
