package com.rahul.spring.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rahul.spring.curd.entity.Product;
import com.rahul.spring.curd.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping(value = "/addProduct")
	public Product addNewProduct(@RequestBody Product product) {
		return service.saveProduct(product);	
	}
	
	@PostMapping(value = "/addProducts")
	public List<Product> addNewProducts(@RequestBody List<Product> products) {
		return service.saveProducts(products);	
	}
	
	@GetMapping(value = "/products")
	public List<Product> findAllProducts() {
		return service.getProducts();
	}
	
	@GetMapping(value = "/product/{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@GetMapping(value = "/product/{name}")
	public Product findProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	
	@PutMapping(value = "/update")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
	}
	
	
	


