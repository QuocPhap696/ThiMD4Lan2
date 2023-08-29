package com.example.thimd4lan2.service;

import com.example.thimd4lan2.model.Category;
import com.example.thimd4lan2.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(int id){
        return categoryRepository.findById(id).orElse(null);
    }
}
