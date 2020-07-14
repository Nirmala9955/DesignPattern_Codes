package com.nt.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.nt.sdp.PrinterUtil;

public class SingletonReflectionTest {

	public static void main(String[] args) {
		Class cls = null;
		Constructor cons[] = null;
		PrinterUtil pu=null, pu1=null;
		try {
			//load the class
			cls = Class.forName("com.nt.sdp.PrinterUtil");
			//get all declared constructors
			cons=cls.getDeclaredConstructors();
			//provide access to private constructor
			cons[0].setAccessible(true);
			//create object using above accessed constructor
			pu = (PrinterUtil)cons[0].newInstance(null);
			System.out.println("pu hashCode : "+pu.hashCode());	
			pu1 = PrinterUtil.getInstance();
			System.out.println("pu1 hashCode : "+pu1.hashCode());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
