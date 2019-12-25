export class GroceryItemModel {
  groceryId: number ;
  groceryName: string = '';
  groceryDescription: string = '';

  constructor(values: Object = {}) {
    Object.assign(this, values);
  }
}
