import { Component, OnInit } from '@angular/core';
import { user } from 'src/app/Data/user';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  constructor(private _userService: UserService) { }

  ngOnInit(): void {
     
  }
 
  
  
  userinfo: user = new user;



  sendData(value:any)
  { 
    this.userinfo.name=value.username;
    this.userinfo.address=value.address;

    this._userService.saveUser(this.userinfo).subscribe();
  }

}
