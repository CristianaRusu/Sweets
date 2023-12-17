package com.Sweets.Sweets.Ocasion;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.Sweets.Sweets.Cakes.Cake;
@Entity
@Table(name="Ocasions")
public class Ocasion extends Cake
{
public enum TypeOcasion
{
	wedding,
	birthdayParty,
	daily,
	
}
private TypeOcasion ocasion;
	public TypeOcasion getOcasion() {
	return ocasion;
}
public void setOcasion(TypeOcasion ocasion) {
	this.ocasion = ocasion;
}
	public Ocasion(String name, Type type, int price, int quantity, int produced, TypeOcasion ocasion) {
		super(name, type, price, quantity, produced);
		this.ocasion=ocasion;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString() + " is a " + ocasion+" type of cake ";
	}
}
