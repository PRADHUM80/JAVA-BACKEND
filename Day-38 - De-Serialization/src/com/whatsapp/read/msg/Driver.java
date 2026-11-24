package com.whatsapp.read.msg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.whatsapp.message.Message;


public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream fis = new FileInputStream("E:\\d\\kodewala\\Work-Space\\Day-38-Serialization\\message.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Message message = (Message) ois.readObject(); // Read The Message..
		
		System.out.println("De Ser : " + message.getMessage());
	}

}
