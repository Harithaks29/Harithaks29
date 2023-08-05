import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-coursecard',
  templateUrl: './coursecard.component.html',
  styleUrls: ['./coursecard.component.css']
})
export class CoursecardComponent implements OnInit {
 
 @Input()
 course: any

 @Output() selectedCourseText = new EventEmitter<string>()
 
 constructor() {}

 getColor(likes: any){
  switch(likes){
    case (100):
      return 'red';
    case (50):
      return 'blue';
    default :
      return 'purple';
  }
}


 select(course:any){
  console.log("button clicked")
  this.selectedCourseText.emit("this course is"+ course.course)
 }
 
 
 
 
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
 

}


