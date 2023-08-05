import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TrailComponent } from './trail/trail.component';
import { LoginComponent } from './login/login.component';
import { NewComponent } from './new/new.component';
import { Trail1Component } from './trail1/trail1.component';
import { CategoriesComponent } from './categories/categories.component';
import { Trail4Component } from './trail4/trail4.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CourseComponent } from './course/course.component';
import { CoursedetailsComponent } from './coursedetails/coursedetails.component';
import { CoursecardComponent } from './coursecard/coursecard.component';
import { SlickCarouselModule } from 'ngx-slick-carousel';

@NgModule({
  declarations: [
    AppComponent,
    TrailComponent,
    LoginComponent,
    NewComponent,
    Trail1Component,
    CategoriesComponent,
    Trail4Component,
    CourseComponent,
    CoursedetailsComponent,
    CoursecardComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    SlickCarouselModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 
  title = 'LMS';
}
