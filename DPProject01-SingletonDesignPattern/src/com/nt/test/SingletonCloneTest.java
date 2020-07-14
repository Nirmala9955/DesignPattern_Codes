package com.nt.test;

import com.nt.sdp.PrinterUtil;

public class SingletonCloneTest {

	public static void main(String[] args) {
		PrinterUtil pu=null, pu1=null;

		//get the object
		pu=PrinterUtil.getInstance();
		System.out.println(pu.hashCode());

		//create another object using cloning
		try {
			pu1 = (PrinterUtil)pu.clone();
			System.out.println("pu hashCode : "+pu.hashCode()+"\npu1 hashCode : "+pu1.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
