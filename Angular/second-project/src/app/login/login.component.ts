import { Component,  EventEmitter,  Input,  OnInit, Output } from '@angular/core';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username="";
  password="";
 @Input() color:string="";
//  @Output() loginEvent:EventEmitter<string>=new EventEmitter<string>();
@Output() loginEvent:EventEmitter<User>=new EventEmitter<User>();

  constructor() { }

  ngOnInit(): void {
  }

  fnLogin()
  {
    // alert('Login button is clicked');
    // alert(this.username);
    let user:User=new User();
    user.username=this.username;
    user.password=this.password;
    this.loginEvent.emit(user);
    
  }

}
