package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GroceryDto;
import com.example.demo.service.GroceryService;
import com.example.demo.utils.Constants;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/grocery")
@RestController
public class GroceryController {
  @Autowired
  GroceryService groceryService;


  @RequestMapping(Constants.GET_ALL_GROCERYLIST)
  public List<GroceryDto> getAllGroceryList() {
    return groceryService.getAllGroceryList();
  }

  @RequestMapping(value= Constants.SAVE_GROCERY, method=RequestMethod.POST)
  public void saveUser(@RequestBody GroceryDto groceryDto) {
    groceryService.saveGrocery(groceryDto);
  }

  @RequestMapping(value= Constants.DELETE_GROCERY, method=RequestMethod.DELETE)
  public void deleteGrocery(@RequestBody GroceryDto groceryDto) {
    groceryService.deleteGrocery(groceryDto);
  }

  @RequestMapping(value= Constants.UPDATE_GROCERY, method=RequestMethod.PUT)
  public void updateGrocery(@RequestBody GroceryDto groceryDto) {
    groceryService.updateGrocery(groceryDto);
  }
}
