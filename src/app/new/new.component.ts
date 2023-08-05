import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-new',
  templateUrl: './new.component.html',
  styleUrls: ['./new.component.css']
})

export class NewComponent {
  images: string[] = [
    'assets/image/theri.jpg',
    'assets/image/doctor1.jpg',
    'assets/image/psycho.jpg',
    // Add more image URLs as needed
  ];
  currentImageIndex = 0;
  nextImage() {
    this.currentImageIndex = (this.currentImageIndex + 1) % this.images.length;
  }
  ngOnInit() {
    setInterval(() => {
      this.nextImage();
    }, 1000);
  }
    
  


  

}