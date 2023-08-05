import { Injectable } from '@angular/core';
import { AbstractControlDirective } from '@angular/forms';
import { BehaviorSubject } from 'rxjs';
import { Action } from 'rxjs/internal/scheduler/Action';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  public selectedmovie:BehaviorSubject<any>=new BehaviorSubject<any>({})

  constructor() { }
  movies=[{
    'img' : 'assets/image/theri.jpg',
    'id' : 5674,
    'name': 'theri',
    'type': 'action',
    show : true,
    'pay': 500,
    'specialtag':'a'
   
  },

{
  'img' : 'assets/image/psycho.jpg',
  'id': 8976,
  'name' : 'psycho',
  'type': 'thriller',
  show : true,
  'pay': 250,
  'specialtag':'b'  
},

{
  'img' : 'assets/image/doctor1.jpg',
  'id': 8978,
  'name' : 'doctor',
  'type': 'comedy',
  show: true,
  'pay': 250,
  'specialtag':'c',
  'style': 1
},
{
  'img' : 'assets/image/varisu.jpg',
  'id': 8972,
  'name' : 'varisu',
  'type': 'family',
  show : false,
  'pay': 150,
  'specialtag':'d'
},
{
  'img' : 'assets/image/kanjana.jpg',
  'id': 8970,
  'name' : 'kanjana',
  'type': 'horror',
  show : false,
  'pay': 150,
  'specialtag':'e'
}]
getmovies(){
  return this.movies
}
addmovie(movies:any){
  this.movies.push(movies);
}
initselectedmovie(){
  let movies={

    'img' : 'assets/image/kanjana.jpg',
    'id': 8970,
    'name' : 'kanjana',
    'type': 'horror',
    show : false,
    'pay': 150,
    'specialtag':'e'
  };
  this.selectedmovie.next(movies);
}
}
