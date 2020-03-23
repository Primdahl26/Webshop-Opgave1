package Primdahl.Webshop.service;

import Primdahl.Webshop.model.Product;
import Primdahl.Webshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ArrayList<Product> readAll(){
        return new ArrayList<>(productRepository.readAll());
    }

    public void create(Product product){
        productRepository.create(product);
    }

    public boolean update(Product product){
        return productRepository.update(product);
    }

    public Product read(long id){
        return productRepository.read(id);
    }

    public boolean delete(long id){
        return productRepository.delete(id);

    }
}
