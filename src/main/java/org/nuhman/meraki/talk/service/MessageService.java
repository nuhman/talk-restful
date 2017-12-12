package org.nuhman.meraki.talk.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.nuhman.meraki.talk.database.DatabaseClass;
import org.nuhman.meraki.talk.modal.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1, "nuhman", "hey..."));
		messages.put(2L, new Message(2, "aish", "hmm..."));
	}
	
		
	public List<Message> getMessages() {				
		return new ArrayList<Message>(messages.values());		
	}
	
	public Message getMessageById(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message msg) {
		msg.setId(messages.size() + 1);
		messages.put(msg.getId(), msg);
		return msg;
	}
	
	public Message updateMessage(Message msg) {
		if(msg.getId() <= 0) return null;
		messages.put(msg.getId(), msg);
		return msg;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
	
	
}
