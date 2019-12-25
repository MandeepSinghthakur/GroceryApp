package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Grocery implements Serializable{

  private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;

  @Column
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private Integer groceryId;
    @Column
    private String groceryName;
    private String groceryDescription;

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

    public Grocery(){
    }

    public Grocery(String groceryName,String groceryDescription ) {
      this.groceryName = groceryName;
      this.groceryDescription = groceryDescription;
    }
}
