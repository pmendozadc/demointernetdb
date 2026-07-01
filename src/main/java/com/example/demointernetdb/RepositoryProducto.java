package com.example.demointernetdb;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProducto extends JpaRepository<Producto, Integer> {

	public List<Producto> findByPrecio(double precio);
}