package com.Sweets.Sweets.basket;

import java.util.ArrayList;

import com.Sweets.Sweets.Cakes.Cake;

public class Basket 
{
 private ArrayList<Cake>cakesList=new ArrayList<Cake>();
 private int totalCost;
public ArrayList<Cake> getCakesList() {
	return cakesList;
}
public void setCakesList(ArrayList<Cake> cakesList) {
	this.cakesList = cakesList;
}
public int getTotalCost() {
	return totalCost;
}
public void setTotalCost(int totalCost) {
	this.totalCost = totalCost;
}
public void addCake(Cake cake) {
	cakesList.add(cake);
}
}
