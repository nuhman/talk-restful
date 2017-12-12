package org.nuhman.meraki.talk.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.nuhman.meraki.talk.modal.Message;
import org.nuhman.meraki.talk.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET	
	public List<Message> getMessages() {
		return messageService.getMessages();
	}
	
	@POST	
	public Message addMessage(Message msg) {
		return messageService.addMessage(msg);
	}
	
	@PUT
	@Path("/{msgId}") 	
	public Message updateMessage(@PathParam("msgId") long id, Message msg) {
		msg.setId(id);
		return messageService.updateMessage(msg);
	}
	
	@DELETE
	@Path("/{msgId}") 		
	public void deleteMessage(@PathParam("msgId") long id) {		
		messageService.removeMessage(id);
	}
	 
	
	@GET
	@Path("/{msgId}")	
	public Message getMessageById(@PathParam("msgId") long id ) {
		return messageService.getMessageById(id);
	}
}
