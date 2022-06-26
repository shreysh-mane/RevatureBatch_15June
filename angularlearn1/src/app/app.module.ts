import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { TestComponent } from './components/test/test.component';
import { FormsModule } from '@angular/forms';
import { StrucdirectiveComponent } from './components/strucdirective/strucdirective.component';
import { CompinteractionComponent } from './components/compinteraction/compinteraction.component';
import { UserComponent } from './components/user/user.component';

import { UserService } from './services/user.service';
import { LoginComponent } from './components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';
import { AdminComponent } from './components/admin/admin.component';
import { UserlistComponent } from './components/admin/userlist/userlist.component';
import { FlightlistComponent } from './components/admin/flightlist/flightlist.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    TestComponent,
    StrucdirectiveComponent,
    CompinteractionComponent,
    UserComponent,
    LoginComponent,
    SignupComponent,
    AdminComponent,
    UserlistComponent,
    FlightlistComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
