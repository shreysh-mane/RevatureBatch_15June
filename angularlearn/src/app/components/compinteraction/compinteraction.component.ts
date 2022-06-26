import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';


@Component({
  selector: 'app-compinteraction',
  templateUrl: './compinteraction.component.html',
  styleUrls: ['./compinteraction.component.css']
})
export class CompinteractionComponent implements OnInit {

  @Input("parentData") useraddress:any;

  @Output() event=new EventEmitter();
  
  sendData(){
    this.event.emit("Hello from child");
  }

  constructor() { }

  ngOnInit(): void {
  }

}
