package tn.esprit.spring.serviceinterface;

import java.util.List;

import tn.esprit.spring.model.Product;

public interface ProductInterface {
	//to save new product
	public Product saveProduct (Product product);
	//to update product
	public Product updateProduct (Product product);
	//to fetch all products from database
	public List<Product> findAllProducts();
	//to delete product
	public void deleteProduct (int id);
	
	

}
