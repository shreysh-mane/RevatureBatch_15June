import { Component, OnInit } from '@angular/core';
import { user } from 'src/app/Data/user';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-datausers',
  templateUrl: './datausers.component.html',
  styleUrls: ['./datausers.component.css']
})
export class DatausersComponent implements OnInit {

  constructor(private _userService: UserService) { }

  ngOnInit(): void {
     
  }
  Users: user[] = [];
  



  getUser(){
    this._userService.getAllUsers().subscribe((Response)=>this.Users=Response);
  }



}
