package com.revised.whatsappMessage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSerialization 
{

	public void serializeMsg(Message message) throws IOException 
	{
//		First..
		FileOutputStream fio = new FileOutputStream("Message.ser"); // ser menas Serilazable...
				
//		Second
		ObjectOutputStream oos = new ObjectOutputStream(fio);
		
//		Third.
		oos.writeObject(message);
		
		oos.close(); // Close The Connection..
	}
}
