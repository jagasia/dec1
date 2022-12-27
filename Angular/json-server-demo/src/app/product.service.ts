import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  URL="http://localhost:3000/product";
  constructor(private http:HttpClient) { }

  getAllProducts()
  {
    return this.http.get(this.URL);
  }

  findProductById(id:number)
  {
    return this.http.get(this.URL+"/"+id);
  }

  addProduct(product:any)
  {
    return this.http.post(this.URL,product);
  }

  updateProduct(product:any)
  {
    return this.http.put(this.URL+"/"+product.id,product);
  }

  deleteProduct(id:number)
  {
    return this.http.delete(this.URL+"/"+id);
  }
}
