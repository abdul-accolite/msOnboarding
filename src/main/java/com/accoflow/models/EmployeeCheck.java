package com.accoflow.models;

public class EmployeeCheck {
   private int empId;
   private String name;
   public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

private boolean isnewEmployee;

	public int getEmpid() {
		return empId;
	}

	public void setEmpid(int empid) {
		empId = empid;
	}

	public boolean isIsnewEmployee() {
		return isnewEmployee;
	}

	public void setIsnewEmployee(boolean isnewEmployee) {
		this.isnewEmployee = isnewEmployee;
	}
   
}
