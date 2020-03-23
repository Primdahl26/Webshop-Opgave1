package Primdahl.Webshop.repository;

import Primdahl.Webshop.model.Product;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;


@Repository
public class ProductRepository implements ICrudRepository<Product>{

    private ArrayList<Product> products = new ArrayList<>();

    public ProductRepository(){
        this.products.add(new Product(1, "Kaffe", 45.0, "Laekker kaffe"));
        this.products.add(new Product(1, "Te", 30.0, "Super te fra Kina"));
        this.products.add(new Product(1, "Is", 22.0, "Kolig Magnum"));
        this.products.add(new Product(1, "Lakridspibe", 5.0, "Skippers lakridspibe"));
        this.products.add(new Product(1, "Bolcher", 47.5, "Laekre bolcher fra Koge Nord"));
        this.products.add(new Product(1, "Pepsi Max", 5.0, "Nul kalorier og god smag"));
    }

    @Override
    public ArrayList<Product> readAll(){
        return products;
    }

    @Override
    public Product read(long id) {
        int i=0;
        while (i<products.size()){
            if (products.get(i).getId()==id){
                return products.get(i);
            }
            i++;
        }
        return null;
    }

    @Override
    public boolean update(Product product) {

        for (int i=0; i<products.size(); i++){
            if (products.get(i).getId() == product.getId()){
                products.set(i, product);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(long id) {
        //find og slet element med id
        int i=0;
        while (i<products.size()){
            if (products.get(i).getId()==id){
                products.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }

    // Adds a new product to collection
    @Override
    public void create(Product product){
        products.add(product);
    }

}
