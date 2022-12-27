import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ReactiveFormsModule  } from '@angular/forms';
import { ProductComponent } from './product/product.component';
import { HttpClientModule } from '@angular/common/http';
import { AirlineComponent } from './airline/airline.component';
import { AirlineGridComponent } from './airline-grid/airline-grid.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    AirlineComponent,
    AirlineGridComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
