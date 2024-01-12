package com.soumalya.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soumalya.project.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
