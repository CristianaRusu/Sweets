package com.Sweets.Sweets.User;

import java.util.List;

import com.Sweets.Sweets.Cakes.Cake;

public class Rezervation {
	private int rezervationNr;
	private Customer customer;
	private List<Cake> wantedPurchase;
	public Rezervation(int rezervationNr, Customer customer, List<Cake>wantedPurchase )
	{
		this.rezervationNr=rezervationNr;
		this.customer=customer;
		
	}
	public int getRezervationNr() {
		return rezervationNr;
	}
	public void setRezervationNr(int rezervationNr) {
		this.rezervationNr = rezervationNr;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Cake> getWantedPurchase() {
		return wantedPurchase;
	}
	public void setWantedPurchase(List<Cake> wantedPurchase) {
		this.wantedPurchase = wantedPurchase;
	}
	@Override
	public String toString()
	{
		return "Rezervation:"+rezervationNr +" Customer:"+customer+" wanted products:"+wantedPurchase;
	}
}
