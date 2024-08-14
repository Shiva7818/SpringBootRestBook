package com.api.book.Controller;

import org.springframework.web.bind.annotation.*;
import com.api.book.entities.Book;

@RestController
@RequestMapping("/api") // Add a base path to avoid conflicts with static resources
public class BookController {

    @GetMapping("/books")
    public String getBooks() {
        return "this is testing book first";
    }
}






// package com.api.book.Controller;
// import org.springframework.web.bind.annotation.*;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import com.api.book.entities.Book;
// import org.springframework.stereotype.Controller;


// @Controller
// public class BookController {
//     @RequestMapping(value="/books",method=RequestMethod.GET)
//     @ResponseBody
//     public String getBooks()
//     {
//      return "this is testing book first";
//     }
    
   
    
// }

// @GetMapping("/books")
//     public Book getBooks()
//     {
//         Book book = new Book();
//         book.setId(1);
//         book.setTitle("Java Complete Refernce");
//         book.setAuthor("XYZ");

//         return book;

//     }@RestController