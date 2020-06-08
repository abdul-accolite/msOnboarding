package com.accoflow.models;

public class logsTable {

	private int logId;
	private String onboardeeName;
	private String updatedBy;
	private String updatedFields;
	public int getLogId() {
		return logId;
	}
	public void setLogId(int logId) {
		this.logId = logId;
	}

	public String getOnboardeeName() {
		return onboardeeName;
	}
	public void setOnboardeeName(String string) {
		this.onboardeeName = string;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedFields() {
		return updatedFields;
	}
	public void setUpdatedFields(String updatedFields) {
		this.updatedFields = updatedFields;
	}
	
}
