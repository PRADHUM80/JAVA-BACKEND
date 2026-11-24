
package com.revised.whatsappMessage;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException
	{
		MessageSerialization msgSeri = new MessageSerialization();
		
		Message message = new Message("MSG1", "Kya Kr Rhe ho");
		// When u get the Msg --> Deserialization..
		msgSeri.serializeMsg(message);
	}

}
