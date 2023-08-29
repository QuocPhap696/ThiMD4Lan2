package com.example.thimd4lan2.service;

import com.example.thimd4lan2.model.Book;
import com.example.thimd4lan2.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public Book saveReturn(Book b) {
        Book bSave = bookRepository.save(b);
        return bSave;
    }

    public void updateBook(Book book){
        bookRepository.save(book);
    }
    public Book findById(Integer id){
        return bookRepository.findById(id).get();
    }
    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }

//    public List<Book> findBooksByName(String name, String priceSort){
//        name = "%" + name + "%";
//        if (priceSort.equalsIgnoreCase("asc")){
//            return productRepository.findByNameContainingOrderByPriceAsc(name);
//        }else {
//            return productRepository.findByNameContainingOrderByPriceDesc(name);
//        }
//    }
}
