package com.nt.sdp;

import com.nt.commons.CommonUtils;

public class PrinterUtil extends CommonUtils {

	private static PrinterUtil INSTANCE;
	private static boolean isInstantiated = false;

	private PrinterUtil() {
		//To stop Reflection API based Constructor access
		if (isInstantiated==true) 
			throw new InstantiationError("Object is already created");
		isInstantiated = true;
		System.out.println("PrinterUtil : PrinterUtil()");
	}

	//factory method 
	public static PrinterUtil getInstance() {
		try {
			//SingletoneTest
//			if (INSTANCE==null) 
//				INSTANCE = new PrinterUtil();	//Lazy instantiation is Good practice 

			//MultiThreadSingletoneTest
			if (INSTANCE==null) {	//First null check
				synchronized (PrinterUtil.class) {
					if (INSTANCE==null)		//second null check
						INSTANCE = new PrinterUtil();	//Lazy instantiation is Good practice  
				} //synchronized(-)
			} //if
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return INSTANCE;
	}

//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	} Problem create a new object that break the Singleton class rule
	
	//Solve cloning problem in Singleton java class
	@Override
	public  Object clone() throws CloneNotSupportedException {
		//return this;		//[Not recommended]
		//return INSTANCE;	//[Not recommended]
		return new CloneNotSupportedException("Clonign is not allow on this Singletone class");	//[Recommended]
	}

	//Solve the DeSerialization problem in Singleton Java class
	public Object readResolve() {
		System.out.println("PrinterUtil : readResolve()");
//		return INSTANCE;	
		return new IllegalArgumentException("do not want to support DeSerialization");	//[Best]
		
	}
	
}