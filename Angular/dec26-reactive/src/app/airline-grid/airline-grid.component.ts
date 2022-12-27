import { Component, OnInit } from '@angular/core';
import { AirlineService } from '../airline.service';

@Component({
  selector: 'app-airline-grid',
  templateUrl: './airline-grid.component.html',
  styleUrls: ['./airline-grid.component.css']
})
export class AirlineGridComponent implements OnInit {
  airlines:any;
  constructor(private as:AirlineService) { }

  ngOnInit(): void {
    this.as.getAllAirlines().subscribe((data)=>{
      this.airlines=data;
      //alert("retrieved all airlines");
    });

  }

}
