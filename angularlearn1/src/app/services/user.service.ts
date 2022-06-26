import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { }

  getUser(){
    return [
      {
      "id":1,"name":"shreysh"
      },
      {
        "id":2,"name":"yash"
      },
      {
        "id":3,"name":"abc"
      }
    ];
  }
}
