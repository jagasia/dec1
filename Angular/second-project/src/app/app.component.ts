import { Component } from '@angular/core';
import { User } from './user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  color:string="";
  title = 'My Project';

  fnLoginEvent(args:User)
  {
    // alert(JSON.stringify(args));
    if(args.username==args.password)
      alert('Login failed');
    else
      alert('Login success');
  }
}
