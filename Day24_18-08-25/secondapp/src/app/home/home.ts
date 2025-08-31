import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  imports: [FormsModule],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
   books= [
    {
      title: 'To Kill a Mockingbird',
      
      description: 'A timeless story of justice and moral growth in the American South.',
      image: 'https://picsum.photos/seed/book1/300/420'
    },
    {
      title: '1984',
      
      description: 'A dystopian vision of surveillance, control, and resistance.',
      image: 'https://picsum.photos/seed/book2/300/420'
    },
    {
      title: 'The Great Gatsby',
      
      description: 'The Jazz Age classic about wealth, love, and the American Dream.',
      image: 'https://picsum.photos/seed/book3/300/420'
    },
    {
      title: 'Pride and Prejudice',
      
      description: 'Wit and romance in a sharp social satire of manners.',
      image: 'https://picsum.photos/seed/book4/300/420'
    },
    {
      title: 'Moby-Dick',
  
      description: 'An epic hunt that probes obsession, fate, and nature.',
      image: 'https://picsum.photos/seed/book5/300/420'
    },
    {
      title: 'The Catcher in the Rye',
      
      description: 'A rebellious teen’s candid journey through New York.',
      image: 'https://picsum.photos/seed/book6/300/420'
    },
    {
      title: 'The Hobbit',
      
      description: 'A charming adventure that preludes The Lord of the Rings.',
      image: 'https://picsum.photos/seed/book7/300/420'
    },
    {
      title: 'Fahrenheit 451',
      
      description: 'Books are outlawed; one fireman questions everything.',
      image: 'https://picsum.photos/seed/book8/300/420'
    },
    {
      title: 'Brave New World',
      
      description: 'A “perfect” society hides engineered conformity.',
      image: 'https://picsum.photos/seed/book9/300/420'
    },
    {
      title: 'The Alchemist',
      
      description: 'A shepherd follows his Personal Legend across the desert.',
      image: 'https://picsum.photos/seed/book10/300/420'
    },
    {
      title: 'The Kite Runner',
      
      description: 'Friendship, guilt, and redemption across decades.',
      image: 'https://picsum.photos/seed/book11/300/420'
    },
    {
      title: 'The Book Thief',
      
      description: 'A girl steals books to survive the darkness of war.',
      image: 'https://picsum.photos/seed/book12/300/420'
    },
    {
      title: 'Sapiens',
      
      description: 'A sweeping history of humankind’s rise.',
      image: 'https://picsum.photos/seed/book13/300/420'
    },
    {
      title: 'The Martian',
      
      description: 'An astronaut fights to survive alone on Mars.',
      image: 'https://picsum.photos/seed/book14/300/420'
    },
    {
      title: 'Atomic Habits',
      
      description: 'Tiny changes, remarkable results—habits made practical.',
      image: 'https://picsum.photos/seed/book15/300/420'
    },
    {
      title: 'The Silent Patient',
      
      description: 'A psych thriller about a painter who stops speaking.',
      image: 'https://picsum.photos/seed/book16/300/420'
    },
    {
      title: 'Educated',
      
      description: 'A memoir of self-invention through education.',
      image: 'https://picsum.photos/seed/book17/300/420'
    },
    {
      title: 'The Midnight Library',
      
      description: 'Between life and death lies a library of possibilities.',
      image: 'https://picsum.photos/seed/book18/300/420'
    },
    {
      title: 'Project Hail Mary',
      
      description: 'One man, one ship, one last-ditch mission to save Earth.',
      image: 'https://picsum.photos/seed/book19/300/420'
    },
    {
      title: 'Deep Work',
      
      description: 'Rules for focused success in a distracted world.',
      image: 'https://picsum.photos/seed/book20/300/420'
    }
  ];
}

