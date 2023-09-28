package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IProductosServices;
import org.cibertec.edu.pe.interfaces.IProductos;
import org.cibertec.edu.pe.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductoService implements IProductosServices{

	@Autowired
	private IProductos productoRepository;
	
	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		return productoRepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		productoRepository.save(producto);	
		
	}

	@Override
	public void delete(Integer id) {
		productoRepository.deleteById(id);	
		
	}

	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}

	
}
