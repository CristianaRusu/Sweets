package com.Sweets.Sweets.Cakes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Cakes")
@Inheritance(strategy = InheritanceType.JOINED)

public class Cake 
{

	public enum Type
{
		butterCake,
		spongeCake,
		flourlessCake,
}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	

	private String name;
	private Type type;
    private int price;
    private int quantity;
    private int produced;
    private int nwPrice;
    private boolean stock;
    
    
	public boolean getStock() {
		return stock;
	}
	public void setStock(boolean b) {
		this.stock = b;
	}
	public int getProduced() {
		return produced;
	}
	public void setProduced(int produced) {
		this.produced = produced;
	}
	public int getNwPrice() {
		return nwPrice;
	}
	public void setNwPrice(int nwPrice) {
		this.nwPrice = nwPrice;
	}
	public Cake(String name, Type type, int price, int quantity, int produced) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
		this.produced = produced;
		if(verificareData())
			setNwPrice(getPrice()/2);
		else setNwPrice(0);
		if(stillStock())
			setStock(true);
		else setStock(false);
			
			
	}
	public boolean stillStock()
	{
		if(getQuantity()>0)
			return true;
		return false;
	}
	public boolean verificareData()
	{
		
		if(getProduced()>3)
			return true;
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		String s = "name: " + name + " Type: " + type;
		if(getStock())
           {
			s+=" Still in store";
			if(getNwPrice()>0)
				s+=" Bargain the new price is "+nwPrice;
			else s+=" Price:"+price;
           }
		else s+=" Not available at the moment";
			return s;
	}

}
