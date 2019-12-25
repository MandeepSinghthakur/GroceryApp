import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class GroceryListService {

  constructor(private http:HttpClient) { }
  getGroceryList = () => {
    return this.http.get<any[]>('http://localhost:8081/grocery/getAll');
  }

  addtoGroceryList = (item) => {
    return this.http.post<any>('http://localhost:8081/grocery/saveGrocery', item)

  }

  deleteGroceryItem = (item) => {
    let  options = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      }),
      body: item
    }
    return this.http.delete<any>('http://localhost:8081/grocery/deleteGrocery', options)
  }

  updateGrocery = (item) => {
    return this.http.put<any>('http://localhost:8081/grocery/updateGrocery', item)
  }
  
}
