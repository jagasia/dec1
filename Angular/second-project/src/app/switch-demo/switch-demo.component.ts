import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-switch-demo',
  templateUrl: './switch-demo.component.html',
  styleUrls: ['./switch-demo.component.css']
})
export class SwitchDemoComponent implements OnInit {
  dept:string="ECE";

  constructor() { }

  ngOnInit(): void {
  }

}
