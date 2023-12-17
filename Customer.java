package com.Sweets.Sweets.User;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer extends Account{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer(String firstName, String lastName, String phoneNumber, String email, List<Rezervation> productsList,
			String username, String password) {
		super(firstName, lastName, phoneNumber, email, productsList);
		this.username = username;
		this.password = password;
	}
	public Customer(String firstName, String lastName, String phoneNumber, String email,
			List<Rezervation> productsList) {
		super(firstName, lastName, phoneNumber, email, productsList);
		// TODO Auto-generated constructor stub
	}
	public Customer(String firstName, String lastName, String phoneNumber, String email) 
	{
		super(firstName, lastName, phoneNumber, email);
		// TODO Auto-generated constructor stub
	}
}
