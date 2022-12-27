import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  productForm:any;
  products:any;

  constructor(private fb:FormBuilder, private ps:ProductService) { 
    this.productForm=this.fb.group({
      id:[],
      name:[],
      price:[]
    });
  }

  ngOnInit(): void {
    this.ps.getAllProducts().subscribe((data)=>{
      console.log(data);
      
      this.products=data;
    })
  }

  fnAdd()
  {
    this.ps.addProduct(this.productForm.value).subscribe((data)=>{
      console.log(data);
    });
  }

  fnUpdate()
  {
    this.ps.updateProduct(this.productForm.value).subscribe((data)=>{
      console.log(data);
      
    });
  }

  fnDelete()
  {
    this.ps.deleteProduct(this.productForm.controls.id.value).subscribe((data)=>{
      console.log(data);
      
    })
  }

  fnSelect(id:any)
  {
    this.ps.findProductById(id).subscribe((data)=>{
      
      this.productForm.patchValue(data);
    })
  }
}
