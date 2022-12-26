import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  productForm: any;

  constructor(private fb:FormBuilder) { 
    this.productForm=this.fb.group({
      id:['', Validators.required],
      name:['',[Validators.required]],
      price:['', Validators.required]
    });
  }

  ngOnInit(): void {
  }

  fnSubmit()
  {
    if(this.productForm.valid)
      alert("Submiting...");
  }
}
