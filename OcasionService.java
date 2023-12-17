package com.Sweets.Sweets.Ocasion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sweets.Sweets.Cakes.Cake;


@Service
public class OcasionService {
	@Autowired
	private OcasionRepository ocasionRepository;
	public List<Ocasion> getAllCakes() {
		List<Ocasion> cakes = new ArrayList<>();
		ocasionRepository.findAll()
						 .forEach(cakes::add);
		return cakes;
	}
	public Ocasion getOcasion(String name) {
		return ocasionRepository.findById(name).get();
	}

	public void addOcasion(Ocasion cake) {
		ocasionRepository.save(cake);
	}

	public void updateOcasion(String name, Ocasion cake) {
		ocasionRepository.save(cake);
	}

	public void deleteOcasion(String name) {
		ocasionRepository.deleteById(name);
	}	
}
