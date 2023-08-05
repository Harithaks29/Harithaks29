import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-trail1',
  templateUrl: './trail1.component.html',
  styleUrls: ['./trail1.component.css']
})
export class Trail1Component implements OnInit {
constructor(private movieservice:ServiceService){}
movies:any;
ngOnInit(): void{
  this.movieservice.selectedmovie.subscribe((data)=>{
    this.movies=data;
  });
}
}
