package services;

import models.Product;
import services.impl.ProductServiceImpl;

import java.util.List;

public interface ProductService {

    ProductService INSTANCE = new ProductServiceImpl();

    List<Product> findAllProducts();
}
