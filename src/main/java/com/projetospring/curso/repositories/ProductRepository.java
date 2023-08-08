package com.projetospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
