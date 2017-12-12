package org.nuhman.meraki.talk.modal;

import java.util.Date;

public class Profile {
	private long id;
	private String profilename;
	private String lastname;
	private String firstname;
	private Date created;   
	
	private Profile() {
		
	}
	
	public Profile(long id, String profilename, String lastname, String firstname) {
		this.id = id;
		this.profilename = profilename;
		this.lastname = lastname;
		this.firstname = firstname;
		this.created = new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfilename() {
		return profilename;
	}

	public void setProfilename(String profilename) {
		this.profilename = profilename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
}
