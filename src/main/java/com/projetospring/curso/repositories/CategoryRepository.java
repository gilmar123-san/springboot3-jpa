package com.projetospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
