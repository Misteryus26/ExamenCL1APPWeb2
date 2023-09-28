package org.cibertec.edu.pe.controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IProductosServices;
import org.cibertec.edu.pe.model.Producto;
import org.cibertec.edu.pe.service.ProductoService;
import org.cibertec.edu.pe.service.SubirImagen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/api/productos")
public class CarritoController {

    @Autowired
    private IProductosServices productoService;

    @GetMapping("/")
    public String getAllProductos(Model model) {
        List<Producto> productos = productoService.findAll();
        System.out.println("Número de productos cargados: " + productos.size()); // Agrega esta línea para verificar
        model.addAttribute("productos", productos); // Agrega la lista de productos al modelo
        return "index";
    }
}

