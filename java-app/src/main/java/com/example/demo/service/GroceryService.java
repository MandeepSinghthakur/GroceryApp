package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.GroceryDto;

public interface GroceryService {
  GroceryDto getGroceryById(Integer groceryId);
  void saveGrocery(GroceryDto groceryDto);
  void deleteGrocery(GroceryDto groceryDto);
  void updateGrocery(GroceryDto groceryDto);
  List<GroceryDto> getAllGroceryList();
}
