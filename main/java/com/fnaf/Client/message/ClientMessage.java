package com.fnaf.Client.message;

import net.ilexiconn.llibrary.common.color.EnumChatColor;
import net.ilexiconn.llibrary.common.command.ChatMessage;

public class ClientMessage extends ChatMessage {

	public ClientMessage(String m, EnumChatColor c) {
		super(m, c);
	
		 message = m;
	        color = c;
	        
	        
		
	}

}
