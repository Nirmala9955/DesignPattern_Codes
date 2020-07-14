package com.nt.test;

import com.nt.sdp.PrinterUtils;

public class TicketPrinterServlet implements Runnable {

	@Override
	public void run() {
		PrinterUtils pu = null;
		pu = PrinterUtils.getInstance();
		System.out.println("Current Thread Name : "+Thread.currentThread().getName());
		System.out.println("HashCode : "+pu.hashCode());
	}
	
}