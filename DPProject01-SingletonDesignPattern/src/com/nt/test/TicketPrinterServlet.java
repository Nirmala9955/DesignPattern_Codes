package com.nt.test;

import com.nt.sdp.PrinterUtil;

public class TicketPrinterServlet implements Runnable {

	@Override
	public void run() {
		PrinterUtil pu = null;
		pu = PrinterUtil.getInstance();
		System.out.println("Current Thread Name : "+Thread.currentThread().getName());
		System.out.println("HashCode : "+pu.hashCode());
	}
	
}