package ru.geekbrains.spring.lesson1.repository;


import org.springframework.stereotype.Component;
import ru.geekbrains.spring.lesson1.models.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> productList = new ArrayList<>();

    public ProductRepository() {

    }

    @PostConstruct
    public void init(){
        productList.add(new Product(1l, "apple", 50.0));
        productList.add(new Product(2l, "lemon", 75.0));
        productList.add(new Product(3l, "orange", 100.0));
        productList.add(new Product(4l, "pumpkin", 40.0));
        productList.add(new Product(5l, "lemon", 55.0));
        System.out.println("test PostConstruct");
    }

    public List<Product> findAll(){
        return Collections.unmodifiableList(productList);
    }

    public void addProduct(Product product){
        productList.add(product);
    }

}
