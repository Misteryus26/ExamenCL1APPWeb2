package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.model.Producto;

public interface IProductosServices {
	public Producto save( Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	public List<Producto> findAll();
}
