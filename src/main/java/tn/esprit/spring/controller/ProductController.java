package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.model.Product;
import tn.esprit.spring.serviceimplementation.ProductServiceImpl;

@Controller
@RestController 
@CrossOrigin("*")//postman operations
public class ProductController {
	//to create bean of implementation class
	@Autowired
	private ProductServiceImpl  productServiceImpl;
	//to call save method to save a new product
	@PostMapping (value="saveProduct")
	public Product saveProduct(@RequestBody Product product){
		productServiceImpl.saveProduct(product);
		return product;
		
	}
	

}
