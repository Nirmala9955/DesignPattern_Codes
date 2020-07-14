package com.nt.test;

import com.nt.sdp.PrinterUtil;

public class SingletonTest {
	
	public static void main(String[] args) {
		PrinterUtil pu1 = null, pu2=null;
		//PrinterUtil pu = new PrinterUtil();
		
		pu1 = PrinterUtil.getInstance();
		pu2 = PrinterUtil.getInstance();
		
		System.out.println(pu1.hashCode()+" ... "+pu2.hashCode());
		System.out.println("pu1 and pu2 are refering same object? : "+(pu1==pu2));
		
	}

}
