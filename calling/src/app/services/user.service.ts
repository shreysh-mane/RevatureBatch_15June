import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { user } from '../Data/user';
@Injectable({
  providedIn: 'root'
})
export class UserService {
 
  constructor(private http:HttpClient) { }
  baseurl='http://localhost:9000/makemytrip/api/user/';
 
  
  getAllUsers():Observable<user[]> {
    return this.http.get<user[]>(this.baseurl+"users"); 
  }

  saveUser(userinfo:user){
    console.log(userinfo.name);
    return this.http.post(this.baseurl+"saveuser",userinfo);
  }

  
}
