import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  username="syed";
  number=2;

  typevar="text";

  imgurl="https://media.istockphoto.com/photos/abstract-technological-background-in-vibrant-colors-with-blur-picture-id1310488699";

  constructor() { }

  ngOnInit(): void {
  }


  twowaydata="";

  changeName(value:any){
    this.username=value;
  }

}
