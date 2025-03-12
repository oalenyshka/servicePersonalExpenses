package com.example.servicePersonalExpenses.repository;

import com.example.servicePersonalExpenses.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

