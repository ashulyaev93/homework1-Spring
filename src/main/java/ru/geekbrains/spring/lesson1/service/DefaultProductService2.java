package ru.geekbrains.spring.lesson1.service;

import org.springframework.stereotype.Component;
import ru.geekbrains.spring.lesson1.models.Product;

import java.util.List;

@Component
public class DefaultProductService2 implements ProductService {

    @Override
    public List<Product> getProductList() {
        return null;
    }

}
