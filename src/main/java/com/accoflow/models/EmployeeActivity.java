package com.accoflow.models;

import java.util.List;


public class EmployeeActivity {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfilepic() {
		return profilepic;
	}
	public void setProfilepic(String profilepic) {
		this.profilepic = profilepic;
	}


	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPermissions() {
		return permissions;
	}
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
	public List<logsTable> getRecentLogs() {
		return recentLogs;
	}
	public void setRecentLogs(List<logsTable> recentLogs) {
		this.recentLogs = recentLogs;
	}


	private String name;
	private String email;
	private String profilepic;
	private String designation;
	private String permissions;
	private List<logsTable> recentLogs;
	
}
