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

import org.nuhman.meraki.talk.modal.Profile;
import org.nuhman.meraki.talk.service.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
	
	ProfileService profileService = new ProfileService();
	
	@GET	
	public List<Profile> getProfiles() {
		return profileService.getProfiles();
	}
	
	@POST	
	public Profile addProfile(Profile profile) {
		return profileService.addMessage(profile);
	}
	
	@PUT
	@Path("/{profilename}") 	
	public Profile updateProfile(@PathParam("profilename") String profilename, Profile profile) {
		profile.setProfilename(profilename);
		return profileService.updateProfile(profile);
	}
	
	@DELETE
	@Path("/{profilename}") 		
	public void deleteMessage(@PathParam("profilename") String profilename) {		
		profileService.removeMessage(profilename);
	}	 
	
	@GET
	@Path("/{profilename}")	
	public Profile getProfileByName(@PathParam("profilename") String profilename ) {
		return profileService.getProfileByName(profilename);
	}
	
}
