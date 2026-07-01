package com.example.demointernetdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RestControllerProducto {

	@Autowired
	private RepositoryProducto repo;
	
	@GetMapping("/producto/{id}")
	public Producto consultarPorId(@PathVariable(name = "id") int id) {
		return repo.findById(id).get();
	}
	
	@PostMapping("/registrar")
	public Producto registrar(@RequestBody Producto nuevo) {
		Producto pro = repo.save(nuevo);
		return pro;
	}
	
	@GetMapping("/buscarPorPrecio/{precio}")
	public List<Producto> buscarPorPrecio(@PathVariable(name = "precio") double precio) {
		return repo.findByPrecio(precio);
	}
}