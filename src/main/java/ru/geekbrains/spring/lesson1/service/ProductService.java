package ru.geekbrains.spring.lesson1.service;

import ru.geekbrains.spring.lesson1.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProductList();
}
