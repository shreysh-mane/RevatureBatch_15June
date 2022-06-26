import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-strucd',
  templateUrl: './strucd.component.html',
  styleUrls: ['./strucd.component.css']
})
export class StrucdComponent implements OnInit {

  value="true";

  name:string="shreysh";

  users=["shreysh","yash","rohit"];



  constructor() { }

  ngOnInit(): void {
  }

}
