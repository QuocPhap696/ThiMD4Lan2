package com.example.thimd4lan2.controller.api;

import com.example.thimd4lan2.model.Author;
import com.example.thimd4lan2.model.Category;
import com.example.thimd4lan2.service.AuthorService;
import com.example.thimd4lan2.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorRestController {
    @Autowired
    private AuthorService authorService;


    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        List<Author> authorList = authorService.findAll();
        return ResponseEntity.ok(authorList);
    }
}
