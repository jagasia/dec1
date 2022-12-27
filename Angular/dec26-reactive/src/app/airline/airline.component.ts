import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { AirlineService } from '../airline.service';

@Component({
  selector: 'app-airline',
  templateUrl: './airline.component.html',
  styleUrls: ['./airline.component.css']
})
export class AirlineComponent implements OnInit {
  airlineForm:any;
  constructor(private fb:FormBuilder, private as:AirlineService) { 
    this.airlineForm=this.fb.group({
      "id":[''],
    "name":["Jag Airways"],
    "country":[ "India"],
    "logo":[ "https:[//upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/300px-Qatar_Airways_Logo.svg.png"],
    "slogan":[ "Going Places Alone"],
    "head_quaters":[ "Jag Airways Towers], Chennai], India"],
    "website":[ "www.qatarairways.com"],
    "established":[ "2022"]
    });
  }

  ngOnInit(): void {
  }

  fnAddAirline()
  {
    console.log(this.airlineForm.value);
    this.as.addAirline(this.airlineForm.value).subscribe((data)=>{
      console.log("Below is the response from rest api:");
      
      console.log(this.airlineForm.value);
      
    });
    
  }

}
