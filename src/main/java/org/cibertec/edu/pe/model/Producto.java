package org.cibertec.edu.pe.model;

import java.io.InputStream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int producto_id;
    private String nombre;
    private double precio;
    private String desc;
    private int stock;

    @Lob
    private byte[] imagen;

		
	public Producto() {}


	public Producto(int producto_id, String nombre, double precio, String desc, int stock, byte[] imagen) {
		this.producto_id = producto_id;
		this.nombre = nombre;
		this.precio = precio;
		this.desc = desc;
		this.stock = stock;
		this.imagen = imagen;
	}



	public int getProducto_id() {
		return producto_id;
	}


	public void setProducto_id(int producto_id) {
		this.producto_id = producto_id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public byte[] getImagen() {
		return imagen;
	}


	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	}

