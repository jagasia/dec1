import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  // templateUrl: './login.component.html',
  template:`<font [color]="color">This is text</font>
  <h3 class="text-center">Login Form</h3>
  <form action="">
      <!-- User Name: <input type="text" name="" id="" class="form-control" [value]="username">
       -->
       User Name: <input type="text" name="username" class="form-control" [(ngModel)]="color">
      Password: <input type="password" name="" id="" class="form-control" [value]="password">
      <br>
      <input type="button" value="Login" class="btn btn-success" (click)="fn2()">&nbsp;
      <input type="reset" value="Reset" class="btn btn-warning">
  </form>
  <br>
  <!-- {{x}} -->
  <br>
  <!-- {{20*30}} -->
  {{username}}
  
  <select name="color" [(ngModel)]="color">
      <option>Red</option>
      <option>Blue</option>
      <option>Green</option>
  </select>
  `,
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username:string="abdul";
  password:string="abcd";
  color="yellow";



  
  constructor() { }

  ngOnInit(): void {
  }

  fn1()
  {
    let y:string="ram";
    var i=20;
    
    

  }

  fn2()
  {
    alert('hi');
  }
}
