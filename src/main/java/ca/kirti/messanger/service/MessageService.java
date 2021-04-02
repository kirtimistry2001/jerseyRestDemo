package ca.kirti.messanger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ca.kirti.messanger.database.DatabaseClass;
import ca.kirti.messanger.model.Message;

public class MessageService {
		Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
			messages.put(1L,new Message(1,"message1","Kirti"));
			messages.put(2L,new Message(2,"message2","roy"));
	}
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long messageId) {
		System.out.println("getmessage for:"+messageId);
		return DatabaseClass.getMessages().get(messageId);
	}
	
	public Message addMessage(Message message) {
		long id = messages.size()+1;
		message = new Message(id,"message1","Kirti");
		messages.put(id,message);

		return message;
	}
	public Message deleteMessage(long messageId) {
		return DatabaseClass.getMessages().remove(messageId);
	}
}
