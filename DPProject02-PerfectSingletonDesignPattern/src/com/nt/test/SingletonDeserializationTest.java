package com.nt.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.nt.sdp.PrinterUtils;

public class SingletonDeserializationTest {

	public static void main(String[] args) {
		PrinterUtils pu1=null, pu2=null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		//Perform Serialization on PrinterUtil class object
		try {
			pu1 = PrinterUtils.getInstance();
			System.out.println("pu1 hashCode : "+pu1.hashCode());
			oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
			oos.writeObject(pu1);
			System.out.println("Serialization performed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Perform DeSerialization
		try {
			ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
			pu2=(PrinterUtils)ois.readObject();
			System.out.println("DeSerialization completed");
			System.out.println("pu2 hashCode : "+pu2.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
