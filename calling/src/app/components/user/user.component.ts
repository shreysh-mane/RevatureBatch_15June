import { Component, OnInit } from '@angular/core';
import { user } from 'src/app/Data/user';
import { UserService } from 'src/app/services/user.service';


@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private _userService: UserService) { }

  ngOnInit(): void {
     
  }
  Users: user[] = [];
  
  
  userinfo: user = new user;


  getUser(){
    this._userService.getAllUsers().subscribe((Response)=>this.Users=Response);
  }

  sendData(value:any)
  { 
    this.userinfo.name=value.username;
    this.userinfo.address=value.address;

    this._userService.saveUser(this.userinfo).subscribe();
  }
}
