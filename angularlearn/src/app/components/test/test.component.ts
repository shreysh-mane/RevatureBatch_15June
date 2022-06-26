import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  name="shreysh";
  imgurl="https://media.istockphoto.com/photos/abstract-technological-background-in-vibrant-colors-with-blur-picture-id1310488699";
  username="";

  type="password";
  constructor() { }

  ngOnInit(): void {
  }

onClick(value:string){
  this.name=value;
}

}
