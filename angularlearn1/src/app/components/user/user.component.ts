import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { userData } from 'src/app/userData';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private _userService:UserService) { }
  
  userList:userData[]=[];

  ngOnInit(): void {
    this.userList=this._userService.getUser();
  }

  
}
