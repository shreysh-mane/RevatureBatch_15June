import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormComponent } from './components/form/form.component';

import { from } from 'rxjs';
import { FormStyle } from '@angular/common';

// imported for form creation.
import { FormsModule } from '@angular/forms';
// import service and add in providers.
import { UserService } from './service/user.service';
// import to use http methods
import {HttpClientModule} from '@angular/common/http';

import { TestComponent } from './components/test/test.component';
import { StrucdComponent } from './components/strucd/strucd.component';
import { CompinteractionComponent } from './components/compinteraction/compinteraction.component';
import { UserComponent } from './components/user/user.component';
import { LoginComponent } from './components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';
import { AdminComponent } from './components/admin/admin.component';
import { ViewuserlistComponent } from './components/admin/viewuserlist/viewuserlist.component';
import { ViewflightsComponent } from './components/admin/viewflights/viewflights.component';


@NgModule({
  declarations: [
    AppComponent,
    FormComponent,
    TestComponent,
    StrucdComponent,
    CompinteractionComponent,
    UserComponent,
    LoginComponent,
    SignupComponent,
    AdminComponent,
    ViewuserlistComponent,
    ViewflightsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
   
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
