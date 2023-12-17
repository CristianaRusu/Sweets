package com.Sweets.Sweets.User;

import java.util.List;

public class Account
{
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private List<Rezervation> productsList;
	public Account(String firstName, String lastName, String phoneNumber, String email,
			List<Rezervation> productsList) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.productsList = productsList;
	}
	public Account(String firstName, String lastName, String phoneNumber, String email) {
		// TODO Auto-generated constructor stub
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Rezervation> getProductsList() {
		return productsList;
	}
	public void setProductsList(List<Rezervation> productsList) {
		this.productsList = productsList;
	}
	@Override
	public String toString()
	{
		return "FirstName:"+firstName+" LastNme:"+lastName+" Email:"+email+" Phone number:"+phoneNumber+" Products list:"+productsList;
	}
}
