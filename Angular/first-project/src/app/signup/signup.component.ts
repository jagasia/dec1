import { Component, OnInit } from '@angular/core';
import { User } from '../user';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  username:string="";
  password="";
  firstname="";
  lastname="";
  cpassword="";
  email="";
  phone="";

  constructor() { }

  ngOnInit(): void {
  }


  fnSubmit()
  {
    let user:User=new User();
    user.username=this.username;
    user.firstname=this.firstname;
    user.lastname=this.lastname;
    user.password=this.password;
    user.cpassword=this.cpassword;
    user.phone=this.phone;
    user.email=this.email;
    

    alert("You entered:"+JSON.stringify(user));
  }
}
