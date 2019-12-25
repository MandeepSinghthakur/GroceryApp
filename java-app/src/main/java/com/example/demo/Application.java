package com.example;



import com.example.demo.entity.Grocery;
import com.example.demo.repository.GroceryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class Application {
	@Autowired
	GroceryRepository groceryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		Grocery grocery = new Grocery("Milk", "Good for health");
		groceryRepository.save(grocery);
	}
}
