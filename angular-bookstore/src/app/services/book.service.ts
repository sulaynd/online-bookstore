import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Book } from '../common/book';


@Injectable({
  providedIn: 'root'
})


export class BookService {

  private baseUrl = "http://localhost:8080/api/v1/books";

  //Inject HttpClient
  constructor(private httpClient: HttpClient) { }

  getBooks(): Observable<Book[]> {

    /*
    need to convert this to a book array
    to do we need to call a pipe() method
    which the pipe() method to convert we will use the 
    map operator from the rxjs/operators package 
    and imoprt map from this package
    Observable can have a multiple Observers
    The BookService becomes the Observable and anybody from the Book[]
    becoms an Observer
    Observable return the data and Observer consume the data and in order
    to consume the data the Observer need to subcribe to the Observable
    */
    return this.httpClient.get<GetResponseBooks>(this.baseUrl).pipe(  
    map(response => response._embedded.books)
    );
  }
}

//This will help us to unwrap the book array from the json response
interface GetResponseBooks{
  _embedded: {
    books: Book[];
  }
}