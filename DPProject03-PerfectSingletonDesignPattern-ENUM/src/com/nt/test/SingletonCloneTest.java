package com.nt.test;

import com.nt.sdp.PrinterUtils;

public class SingletonCloneTest {

	public static void main(String[] args) {
		PrinterUtils pu=null, pu1=null;

		//get the object
		pu=PrinterUtils.INSTANCE;
		System.out.println(pu.hashCode());
		//cloning is not possible ENUM based object
		/*
		 * //create another object using cloning try { pu1 = (PrinterUtils)pu.clone();
		 * System.out.println("pu hashCode : "+pu.hashCode()+"\npu1 hashCode : "+pu1.
		 * hashCode()); } catch (CloneNotSupportedException e) { e.printStackTrace(); }
		 */
	}

}
