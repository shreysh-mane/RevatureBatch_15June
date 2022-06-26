import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/service/user.service';
import { userData } from 'src/app/user';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  constructor(private _userService:UserService) { }
  
  user=new userData();

  ngOnInit(): void {
  }

  getData(value:any){
    console.log(value.user);
    this.user.name=value.user;
    this._userService.sendUserData(this.user);

  }

}
