import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/common/book';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {


  books: Book[];
  //Inject BookService
  constructor(private bookService: BookService) { }

  ngOnInit(): void {
      this.listBooks();
  }

listBooks(){
    /*
    - When we Subcrbe the observable method we will get a reponse
        and that response will be a callback function 
        We are going call to that response as Data 
        
    */
    this.bookService.getBooks().subscribe(
        //assign the data to the array of books
        data => this.books = data
        /*
        data => {
            this.books = data;
            console.log(data);
        }
        */
    )
}


}
