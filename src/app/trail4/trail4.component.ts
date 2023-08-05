import { Component } from '@angular/core';

@Component({
  selector: 'app-trail4',
  templateUrl: './trail4.component.html',
  styleUrls: ['./trail4.component.css']
})
export class Trail4Component {
  newValue : any={}
  name:any=[
   
  ]

  edit(value:any): void{

    this.newValue = value;

  }

  submit1(): void{

this.name.push(this.newValue)

  }

add(){

  this.newValue = {}

}
remove(Element:any){
this.name.forEach((value: any,index: any) => {
  if(value==Element)
  this.name.splice(index, 1);
  
});
}
}
