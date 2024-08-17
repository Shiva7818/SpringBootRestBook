package com.api.book.Service;
import java.util.*;
import java.util.stream.*;

import org.springframework.stereotype.Component;

import com.api.book.entities.Book;
@Component
public class BookService {
    private static List<Book> list = new ArrayList<>();
    static{
        list.add(new Book(1,"Java complete reference","ABC"));
        list.add(new Book(2,"CPP complete reference","XYZ"));
        list.add(new Book(3,"Python complete reference","PQR"));
    }

   public List<Book> getAllBooks()
   {
    return list;
   }
   public Book getBookById(int id)
   {
    Book book=null;
    for(int i=0;i<list.size();i++)
    {
        if(list.get(i).getId()==id)
        { return list.get(i);
        }
    }
    // book = list.stream().filter(e->e.getId()==id).findFirst().get();
    return book;
   }

   public void addBook(Book b)
   {
    list.add(b);
   }


   public void deleteBook(int id)
   {

    list = list.stream().filter(book->book.getId()!=id).collect(Collectors.toList());



    // list.stream().filter(book-> {
    //     if(book.getId()!=id)
    //     return true;
    //     else 
    //     return false;
    // }).collect(Collectors.toList());
   }
    

//    update Book

public void updateBook(Book book,int id)
{
 list=list.stream().map(b->
 {
    if(b.getId()==id)
    {
        b.setTitle(book.getTitle());
        b.setAuthor(book.getAuthor());
    }
    return b;
 }).collect(Collectors.toList());
}
}
