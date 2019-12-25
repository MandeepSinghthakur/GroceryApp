import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GroceryListComponent } from './grocery-list/grocery-list.component';


const routes: Routes = [
  {path:'groceryList', component:GroceryListComponent},
  { path: '',
    redirectTo: '/groceryList',
    pathMatch: 'full'
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
