package com.example.demo.converter;

import java.util.stream.Collectors;

import com.example.demo.dto.GroceryDto;
import com.example.demo.entity.Grocery;



public class GroceryConverter {
	public static Grocery dtoToEntity(GroceryDto groceryDto) {
		Grocery grocery = new Grocery(groceryDto.getGroceryName(), null);
		grocery.setGroceryId(groceryDto.getGroceryId());
    grocery.setGroceryDescription(groceryDto.getGroceryDescription());
		return grocery;
	}

	public static GroceryDto entityToDto(Grocery grocery) {
    GroceryDto groceryDto = new GroceryDto(grocery.getGroceryId(), grocery.getGroceryName(), grocery.getGroceryDescription());
    return groceryDto;
	}
}
