package com.Sweets.Sweets.basket;

import java.util.ArrayList;

import com.Sweets.Sweets.Cakes.Cake;
import com.Sweets.Sweets.Cakes.Cake.Type;
import com.Sweets.Sweets.Ocasion.Ocasion;
import com.Sweets.Sweets.Ocasion.Ocasion.TypeOcasion;

public class BasketService {
	private ArrayList<Cake> cakes = new ArrayList<>();
	public BasketService() {
		populate();
	}
	public ArrayList<Cake> getCakes() {
		return cakes;
	}
	public void setCakes(ArrayList<Cake> cakes) {
		this.cakes = cakes;
	}
private void populate() {
		
		Cake c1 = new Ocasion("Pound Cake", Type.butterCake, 10, 2, 2, TypeOcasion.daily);
		Cake c2 = new Ocasion("Chiffon cake", Type.spongeCake, 100, 1,2, TypeOcasion.birthdayParty);
		Cake c3 = new Ocasion("Cherry blossom cake", Type.flourlessCake, 250, 2,1, TypeOcasion.wedding);

		//products.add(p1);
		//products.add(p2);
		cakes.add(c1);
		cakes.add(c2);
		cakes.add(c3);
	}
}
