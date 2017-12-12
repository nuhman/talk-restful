package org.nuhman.meraki.talk.database;

import java.util.HashMap;
import java.util.Map;

import org.nuhman.meraki.talk.modal.Message;
import org.nuhman.meraki.talk.modal.Profile;

public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles(){
		return profiles;
	}
	
}
