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
		return PrinterHolder.INSTANCE;
	}
	
	//nested/static inner class
	private static class PrinterHolder {
		private static PrinterUtils INSTANCE = new PrinterUtils();
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
