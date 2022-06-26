import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/service/user.service';
import { userData } from 'src/app/user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users:userData[]=[];

  constructor(private _userService:UserService) { }

  ngOnInit(): void {
    this._userService.getUser().subscribe((data)=>this.users=data);
  }

}
