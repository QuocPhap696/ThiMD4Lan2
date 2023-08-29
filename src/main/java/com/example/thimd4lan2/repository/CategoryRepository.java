package com.example.thimd4lan2.repository;

import com.example.thimd4lan2.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
