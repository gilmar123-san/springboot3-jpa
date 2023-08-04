package com.projetospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
