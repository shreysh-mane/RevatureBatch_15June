import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DatausersComponent } from './components/datausers/datausers.component';
import { FormComponent } from './components/form/form.component';
import { UserComponent } from './components/user/user.component';

const routes: Routes = [
  {
    path:'',
    component: UserComponent
  },
  {
    path:'form',
    component:FormComponent
  },
  {
    path:'getusers',
    component: DatausersComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
