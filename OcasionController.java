package com.Sweets.Sweets.Ocasion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class OcasionController 
{
	@Autowired
	private OcasionService ocasionService;
	@RequestMapping("/")
	public String getAllCakes(Model model) {
		List<Ocasion> cakes = ocasionService.getAllCakes();
		model.addAttribute("tshirts", cakes);
		return "cakes";
	}
	@RequestMapping("/")
	public Ocasion getCake(@PathVariable String name) {
		return ocasionService.getOcasion(name);
}
	@RequestMapping("/")
	public String addCake(Ocasion cake) {
		ocasionService.addOcasion(cake);
		return"addCake";
	}
	@RequestMapping(method=RequestMethod.PUT, value="/")
	public void updateTshirt(@RequestBody Ocasion cake, @PathVariable String name) {
		ocasionService.updateOcasion(name, cake);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/")
	public void deleteOcasion(@PathVariable String name) {
		ocasionService.deleteOcasion(name);
	}
}
