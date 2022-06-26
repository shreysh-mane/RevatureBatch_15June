import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './components/admin/admin.component';
import { ViewflightsComponent } from './components/admin/viewflights/viewflights.component';
import { ViewuserlistComponent } from './components/admin/viewuserlist/viewuserlist.component';
import { LoginComponent } from './components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';

const routes: Routes = [
  {
    path:'',
    component:LoginComponent
  },
  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'signup',
    component:SignupComponent
  },
  {
    path:'admin',
    component:AdminComponent,
    children:[
      {
        path:'list',
        component:ViewuserlistComponent
      },
      {
        path:'flights',
        component:ViewflightsComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
