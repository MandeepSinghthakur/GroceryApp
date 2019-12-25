package com.example.demo.service.impl;

import com.example.demo.converter.GroceryConverter;
import com.example.demo.dto.GroceryDto;
import com.example.demo.repository.GroceryRepository;
import com.example.demo.service.GroceryService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroceryServiceimpl implements GroceryService {
  @Autowired
  GroceryRepository GroceryRepository;

  @Override
  public GroceryDto getGroceryById(Integer groceryId) {
    return GroceryConverter.entityToDto(GroceryRepository.getOne(groceryId));
  }

  @Override
  public void saveGrocery(GroceryDto groceryDto) {
    GroceryRepository.save(GroceryConverter.dtoToEntity(groceryDto));
  }

  @Override
  public List<GroceryDto> getAllGroceryList(){
    return GroceryRepository.findAll().stream().map(GroceryConverter::entityToDto).collect(Collectors.toList());
  }

  @Override
  public void deleteGrocery(GroceryDto groceryDto) {
    GroceryRepository.deleteById(groceryDto.getGroceryId());
  }

  @Override
  public void updateGrocery(GroceryDto groceryDto) {
     GroceryDto groceryfromDB = GroceryConverter.entityToDto(GroceryRepository.getOne(groceryDto.getGroceryId()));
     groceryfromDB.setGroceryName(groceryDto.getGroceryName());
     groceryfromDB.setGroceryDescription(groceryDto.getGroceryDescription());
     GroceryRepository.save(GroceryConverter.dtoToEntity(groceryfromDB));
  }
}
