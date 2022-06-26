import { EventEmitter,Component, Input, OnInit, Output } from '@angular/core';


@Component({
  selector: 'app-compinteraction',
  templateUrl: './compinteraction.component.html',
  styleUrls: ['./compinteraction.component.css']
})
export class CompinteractionComponent implements OnInit {


  @Input("parentData") apptitle:any;

  constructor() { }

  ngOnInit(): void {
  }

  @Output() public childEvent=new EventEmitter();
  sendData(){
    this.childEvent.emit("Hello from child");
  }
}
