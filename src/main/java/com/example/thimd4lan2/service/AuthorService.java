package com.example.thimd4lan2.service;

import com.example.thimd4lan2.model.Author;
import com.example.thimd4lan2.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAll(){
        return authorRepository.findAll();
    }

    public Author findById(int id){
        return authorRepository.findById(id).orElse(null);
    }
}
