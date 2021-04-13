package tn.esprit.spring.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.model.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
