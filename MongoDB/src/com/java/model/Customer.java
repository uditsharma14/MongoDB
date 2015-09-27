package com.java.model;

import java.util.Date;
import java.util.List;

public class Customer {

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", FirstName="
				+ firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
	}

	private String customerID;
	private String firstName;
	private String lastName;
	private Date dob;
	

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}


}
