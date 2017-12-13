package org.nuhman.meraki.talk.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.nuhman.meraki.talk.database.DatabaseClass;
import org.nuhman.meraki.talk.modal.Profile;

public class ProfileService {
private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService() {
		profiles.put("comrade", new Profile(1, "comrade", "Muhammed", "Nuhman"));
		profiles.put("zach", new Profile(2, "zach", "Sachin", "Tendulkar"));
	}
	
		
	public List<Profile> getProfiles() {				
		return new ArrayList<Profile>(profiles.values());		
	}
	
	public Profile getProfileByName(String profilename) {
		return profiles.get(profilename);
	}
	
	public Profile addMessage(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfilename(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if(profile.getProfilename().isEmpty()) return null;
		profiles.put(profile.getProfilename(), profile);
		return profile;
	}
	
	public Profile removeMessage(String profilename) {
		return profiles.remove(profilename);
	}
}
