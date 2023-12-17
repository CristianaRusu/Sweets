package com.Sweets.Sweets.Cakes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CakeList 
{
	@Autowired
	private CakeRepository cakeRepository;

	public List<Cake> getCakes() {
		List<Cake> cake = new ArrayList<>();
		cakeRepository.findAll().forEach(cake::add);
		return cake;
	}

	public Cake getCake(String name) {
		return cakeRepository.findById(name).get();
	}

	public void addCake(Cake cake) {
		cakeRepository.save(cake);
	}

	public void updateCake(String nume, Cake cake) {
		cakeRepository.save(cake);
	}

	public void deleteProduct(String name) {
		cakeRepository.deleteById(name);
	}
}
