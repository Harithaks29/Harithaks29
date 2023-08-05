import { Component } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent {
  ServiceService: any;
  constructor(private movieservies: ServiceService){}
  movies:any=[]
  ngOnInit(){
    this.movies=this.movieservies.getmovies()
  }
  addmovie(){
    let movies={
      'img' : 'assets/image/kanjana.jpg',
      'id': 8970,
      'name' : 'kanjana',
      'type': 'horror',
       show : false,
      'pay': 150,
      'specialtag':'e'
    }
    this.movieservies.addmovie(movies);
  }
  // initselectedmovie(){
  //   // this.movieservies.addmovie(movies);
  
  // }
  selectmovie(){
    
    this.movieservies.initselectedmovie();
  }

}
