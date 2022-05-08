package com.org.genp.crud;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
		
	}
	public List<Product> saveProduct(List<Product> products){
		return repository.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return repository.findAll();
	}
	public Product getProductById(int id){
		return repository.findById(id).orElse(null);
	}
	public Product getProductByName(String name){
		return repository.findByName(name);
	}
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "product removed !! " +id;
	}
	public Product updateProduct(Product product) {
		Product existingproduct=repository.findById(product.getId()).orElse(null);
		existingproduct.setName(product.getName());
		existingproduct.setQuantity(product.getQuantity());
		existingproduct.setPrice(product.getPrice());
		return repository.save(existingproduct);
		
	}
	

}






























































































