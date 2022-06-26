import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-strucdirective',
  templateUrl: './strucdirective.component.html',
  styleUrls: ['./strucdirective.component.css']
})
export class StrucdirectiveComponent implements OnInit {

  value=false;

  // switch
  name="yash";
  num=1;

  //for
  colors=["red","pink","yellow"];

  constructor() { }

  ngOnInit(): void {
  }

}
