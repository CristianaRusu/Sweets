package com.Sweets.Sweets.basket;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Sweets.Sweets.Cakes.Cake;
import com.Sweets.Sweets.Cakes.Cake.Type;

@Controller
public class BasketController 
{
private BasketService basketService;
	
	private BasketService basket = new BasketService();
	@GetMapping("/")
	public String getAllCakes(Model type) {
		ArrayList<Cake> cakes = basket.getCakes();
		type.addAttribute("basket", cakes);
		return "basket";	
	}
}
