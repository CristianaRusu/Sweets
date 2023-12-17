package com.Sweets.Sweets.Structure;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.Sweets.Sweets.User.Account;
import com.Sweets.Sweets.User.Customer;

public class CustumorStructure {
private ArrayList<Account> accounts = new ArrayList<>();
	
	public CustumorStructure() {
		try {
			populate();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Account> getAccount() {
		return accounts;
	}
	
	public void setAccount(ArrayList<Account> account) {
		accounts.addAll(account);
	}
	private void populate() throws ParseException {  
	    
		Account a1 = new Customer("Jung Han", "Young","0771995104", "jeonghan.svt@yahoo.com");
		Account a2 = new Customer("Sebastian", "Phantomhive","0766687124", "phantomhive.sebaschan@gmail.com");
		Account a3 = new Customer("Woo Young", "Jung","0761999926", "wooyoung.ateez@yahoo.com");
		Account a4 = new Customer("Tsukishima", "Key","0761397057", "tsuki.hk@gmail.com");
		
		accounts.add(a1);
		accounts.add(a2);
		accounts.add(a3);
		accounts.add(a4);
	}
}
