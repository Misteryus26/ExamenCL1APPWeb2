package org.cibertec.edu.pe.controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IProductosServices;
import org.cibertec.edu.pe.model.Producto;
import org.cibertec.edu.pe.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/productos") // Ruta base para todas las operaciones
public class CarritoController {
	



	    @Autowired
	    private IProductosServices productoService;

	    @PostMapping("/")
	    public Producto createProducto(@RequestBody Producto producto) {
	        return productoService.save(producto);
	    }

	    @GetMapping("/{id}")
	    public Optional<Producto> getProducto(@PathVariable Integer id) {
	        return productoService.get(id);
	    }

	    @PutMapping("/{id}")
	    public void updateProducto(@PathVariable Integer id, @RequestBody Producto producto) {
	        Optional<Producto> existingProducto = productoService.get(id);
	        if (existingProducto.isPresent()) {
	            producto.setProducto_id(id);
	            productoService.update(producto);
	        }
	    }

	    @DeleteMapping("/{id}")
	    public void deleteProducto(@PathVariable Integer id) {
	        productoService.delete(id);
	    }

	    @GetMapping("/")
	    public List<Producto> getAllProductos() {
	        return productoService.findAll();
	    }
	}

