
package com.api.book.Controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// import org.springframework.web.bind.annotation.GetMapping;
import com.api.book.Service.BookService;
import com.api.book.entities.Book;
// import org.springframework.stereotype.Controller;

@RestController
// @Controller
public class BookController {
    @Autowired
    private BookService bookService;
    // @RequestMapping(value="/books",method=RequestMethod.GET)
    // @ResponseBody
    // public String getBooks()
    // {
    //  return "this is testing book first";
    // }

@GetMapping("/books")
    public Book getBooks()
    {
        Book book = new Book();
        book.setId(1);
        book.setTitle("Java Complete Refernce");
        book.setAuthor("XYZ");

        return book;

    }
   @GetMapping("/list")
   public List<Book> allBooks()
   {
    List<Book> list = new ArrayList<>();
    list.add(new Book(1,"Java complete reference","ABC"));
    list.add(new Book(1,"CPP complete reference","XYZ"));
    list.add(new Book(1,"Python complete reference","PQR"));
    return list;
   }
 
  
   @GetMapping("/allBooks")
   public List<Book> allBook()
   {
    return this.bookService.getAllBooks();
   }
   @GetMapping("/book/{id}")
   public Book getBook(@PathVariable("id") int id)
   {
    return bookService.getBookById(id);
   }
    
   @PostMapping("/addBook")
   public Book addBook(@RequestBody Book book)
   {
     this.bookService.addBook(book);
     System.out.println(book);
     return book;
   }
   @DeleteMapping("/deleteBook/{bookId}")
   public List<Book> deleteBook(@PathVariable("bookId") int bookId)
   {
    this.bookService.deleteBook(bookId);
    System.out.println(bookService.getAllBooks());
    return bookService.getAllBooks();
   }

   @PutMapping("/book/{bookId}")
   public Book updateBook(@RequestBody Book book ,@PathVariable("bookId") int id)
   {
    this.bookService.updateBook(book,id);
    return bookService.getBookById(id);
   }
}

