package com.nt.test;

import com.nt.sdp.PrinterUtils;

public class SingletonTest {
	
	public static void main(String[] args) {
		PrinterUtils pu1 = null, pu2=null;
		//PrinterUtil pu = new PrinterUtil();
		
		pu1 = PrinterUtils.INSTANCE;
		pu2 = PrinterUtils.INSTANCE;
		
		System.out.println(pu1.hashCode()+" ... "+pu2.hashCode());
		System.out.println("pu1 and pu2 are refering same object? : "+(pu1==pu2));
		
	}

}
