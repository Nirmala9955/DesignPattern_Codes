package com.nt.test;

public class MultiThreadSingletonTest {

	public static void main(String[] args) throws InterruptedException {
		TicketPrinterServlet servlet = null;
		Thread request1 = null, request2 = null;
		
		servlet = new TicketPrinterServlet();
		//thread creation
		request1 = new Thread(servlet);
		request2 = new Thread(servlet);
		
		//start the threads
		request1.start();
	//	Thread.sleep(5000);
		request2.start();
	}

}
