package com.example.thimd4lan2.controller.api;

import com.example.thimd4lan2.model.Book;
import com.example.thimd4lan2.model.Category;
import com.example.thimd4lan2.service.AuthorService;
import com.example.thimd4lan2.service.BookService;
import com.example.thimd4lan2.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController // tao api controller
@RequestMapping("/api/books")
public class ProductRestController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private AuthorService authorService;

    @GetMapping("")
    public ResponseEntity<?> showIndex(){
        List<Book> bookList = bookService.findAll();
        return ResponseEntity.ok(bookList);
    }
    @GetMapping("/create")
    public ResponseEntity<?> showCreate(@ModelAttribute Book book){
        List<Category> categoryList = categoryService.findAll();
        return ResponseEntity.ok(categoryList);
    }
    @PostMapping("/create")
    public ResponseEntity<?> create(@ModelAttribute Book book){
        Category category = categoryService.findById(book.getCategory().getId());
        book.setCategory(category);
        Book bookCreate = bookService.saveReturn(book);
        return ResponseEntity.ok(bookCreate);
    }
    @GetMapping("/edit")
    public ResponseEntity<?> showEdit(@RequestParam int id){
        Book book = bookService.findById(id);
        List<Category> categoryList = categoryService.findAll();
        Map<String, Object> map = new HashMap<>();
        map.put("book",book);
        map.put("categories",categoryList);
        return ResponseEntity.ok(map);
    }
    @PostMapping("/edit")
    public ResponseEntity<?> edit(@ModelAttribute Book book){
        bookService.updateBook(book);
        return ResponseEntity.ok("update");
    }
    //    @GetMapping("/sortPrice")
//    public ResponseEntity<?> sortPrice(@RequestParam String value123){
//        List<Product> productList = productService.getAllProductsSortedByPrice(value123);
//        return ResponseEntity.ok(productList);
//    }
    @GetMapping("/delete")
    public ResponseEntity<?> delete(@RequestParam int id){
        bookService.delete(id);
        return ResponseEntity.ok("xoa thanh cong");
    }
}
