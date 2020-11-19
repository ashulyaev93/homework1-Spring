package ru.geekbrains.spring.lesson1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring.lesson1.models.Product;
import ru.geekbrains.spring.lesson1.repository.ProductRepository;

import java.util.List;

@Component("productService")
public class DefaultProductService implements ProductService {

    private ProductRepository productRepository;

    @Override
    public List<Product> getProductList(){
        return productRepository.findAll();
    }

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

}
