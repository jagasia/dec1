import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';


@Component({
  selector: 'app-for-demo',
  templateUrl: './for-demo.component.html',
  styleUrls: ['./for-demo.component.css']
})
export class ForDemoComponent implements OnInit {
  countries=['India','Australia','Srilanka','China'];

  //declare an array of Employees
  employees:Employee[]=[];

  id:number=0;
  firstName:string='';
  lastName:string='';
  salary:number=0;

  constructor() {     
    this.employees.push(new Employee(1, "Raj","Kumar",123456));
    this.employees.push(new Employee(2, "Abdul","Raheem",213456));
    this.employees.push(new Employee(3, "John","Peter",125456));
    this.employees.push(new Employee(4, "Kathir","Kumar",153456));
    this.employees.push(new Employee(5, "Dinesh","Srinivasan",623456));
    this.employees.push(new Employee(6, "Prasad","Muruga",423456));
  }

  ngOnInit(): void {
  }

  fnAdd()
  {
    let emp:Employee=new Employee(this.id,this.firstName,this.lastName,this.salary);
    console.log(emp);
    this.employees.push(emp);
    
  }

}
