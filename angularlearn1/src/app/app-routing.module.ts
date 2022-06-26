import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './components/admin/admin.component';
import { FlightlistComponent } from './components/admin/flightlist/flightlist.component';
import { UserlistComponent } from './components/admin/userlist/userlist.component';
import { LoginComponent } from './components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';

const routes: Routes = [
  {
    path:"login",
    component:LoginComponent
  },
  {
    path:"signup",
    component:SignupComponent
  },
  {
    path:"admin",
    component:AdminComponent,
    children:[
      {
        path:"userlist",
        component:UserlistComponent
      },
      {
        path:"flightlist",
        component:FlightlistComponent
      }
    ]
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
