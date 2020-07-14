package com.nt.sdp;

public class PrinterUtils {
	
	private static PrinterUtils INSTANCE;
	private static boolean isInstantiated = false;
	
	public PrinterUtils() {
		//To Stop Reflection API based constructor access
		if (isInstantiated==true)
			throw new IllegalArgumentException("Object is already created");
		isInstantiated = true;
		System.out.println("PrinterUtils : PrinterUtils()");
	}
	
	//Factory method
	public static PrinterUtils getInstance() {
		try {
			//TO solve MutiThread related problem : Thread safety
			if (INSTANCE==null) {	//First null check
				synchronized (PrinterUtils.class) {
					if (INSTANCE==null) //second null check
						INSTANCE = new PrinterUtils();
				}		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return INSTANCE;
	}
	
	//TO solve Cloning problem in Singleton java class
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException("Clonign is not possible in Singleton java class");
	}
	
	//To solve DeSerialization problem in Singleton java class
	public Object readResolve() {
		System.out.println("PrinterUtils : readResolve()");
		return new IllegalArgumentException("Don't want to support DeSerialization");
	}
	
	
}
