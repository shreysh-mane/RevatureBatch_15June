import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { userData } from '../user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  // getUser(){
  //   return [
  //     {"id":1,"name":"shreysh"},
  //     {"id":2,"name":"yash"}
  //   ];
   
  // }

    // constructor(){}
    getUser():Observable<userData[]>{
      return this.http.get<userData[]>("/assets/userInfo/users.json");
    }

    sendUserData(value:userData){
      console.log(value);
    }

  constructor(private http:HttpClient) { }
}
