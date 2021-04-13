package tn.esprit.spring.serviceimplementation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.ProductRepository;
import tn.esprit.spring.model.Product;
import tn.esprit.spring.serviceinterface.ProductInterface;

@Service
public class ProductServiceImpl implements ProductInterface{
	@Autowired 
	private ProductRepository productRepo;

	@Override
	public Product saveProduct(Product product) {

		return productRepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {

		return productRepo.save(product); //same save method is used to save a new product
	}

	@Override
	public List<Product> findAllProducts() {
		return (List<Product>) productRepo.findAll();//it returns a list 
	}

	@Override
	public void deleteProduct(int id) {
		productRepo.deleteById(id);

	}


}
