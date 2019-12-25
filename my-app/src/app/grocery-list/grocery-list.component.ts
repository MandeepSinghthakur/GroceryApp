import { Component, OnInit} from '@angular/core';
import { GroceryListService } from '../grocery-list.service';
import { GroceryItemModel } from './groceryModel'

@Component({
  selector: 'grocery-list',
  templateUrl: './grocery-list.component.html',
  styleUrls: ['./grocery-list.component.scss']
})
export class GroceryListComponent implements OnInit {
  groceryList:any[];
  constructor(public groceryListService:GroceryListService ){
  }

  ngOnInit(){
    this.getGroceryList();
  }

  getGroceryList = () => {
  this.groceryListService.getGroceryList()
    .subscribe((data) => {
      if(data) {
        this.groceryList= data;
    }
    })
  }

  addtoGroceryList = (name,description) => {
    if(name.length && description.length) {
    let item = {groceryName: name, groceryDescription: description};
    this.groceryListService.addtoGroceryList(item).subscribe((data) => {
      this.getGroceryList();
      })
    }
    //this.getGroceryList();
  }

  deletefromGroceryList =(item) =>{
    this.groceryListService.deleteGroceryItem(item).subscribe((data) => {
      this.getGroceryList();
    })
  }

  updategroceryList =(item)=> {
    if(item.name && item.name.length && item.description && item.description.length) {
    this.groceryListService.updateGrocery(item).subscribe((data) => {
      this.getGroceryList();
    })
  }
  }
}
