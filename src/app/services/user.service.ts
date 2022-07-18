import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { user } from '../Data/user';
@Injectable({
  providedIn: 'root'
})
export class UserService {
 
  constructor(private http:HttpClient) { }
  baseurl='http://Springbackend202-env.eba-zgb7f7tm.ap-south-1.elasticbeanstalk.com/api/user/';
 
  
  getAllUsers():Observable<user[]> {
    return this.http.get<user[]>(this.baseurl+"getallusers"); 
  }

  saveUser(userinfo:user){
    console.log(userinfo.name);
    return this.http.post(this.baseurl+"saveuser",userinfo);
  }

  
}
