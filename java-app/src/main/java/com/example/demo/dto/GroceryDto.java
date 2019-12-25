package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class GroceryDto {
    Integer groceryId;
    String groceryName;
    String groceryDescription;

    public GroceryDto(Integer groceryId, String groceryName, String groceryDescription) {
        this.groceryId = groceryId;
        this.groceryName = groceryName;
        this.groceryDescription = groceryDescription;
    }

    public GroceryDto() {
    }

    public Integer getGroceryId() {
        return groceryId;
    }

    public void setGroceryId(Integer groceryId) {
        this.groceryId = groceryId;
    }

    public String getGroceryName() {
        return groceryName;
    }

    public void setGroceryName(String groceryName) {
        this.groceryName = groceryName;
    }

    public String getGroceryDescription() {
        return groceryDescription;
    }

    public void setGroceryDescription(String groceryDescription) {
        this.groceryDescription = groceryDescription;
    }
}
