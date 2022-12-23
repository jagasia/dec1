import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PractiseComponent } from './practise/practise.component';
import { SwitchDemoComponent } from './switch-demo/switch-demo.component';
import { ForDemoComponent } from './for-demo/for-demo.component';

@NgModule({
  declarations: [
    AppComponent,
    PractiseComponent,
    SwitchDemoComponent,
    ForDemoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
