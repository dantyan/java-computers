package services.impl;

import dao.ProductDao;
import models.Product;
import services.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    ProductDao productDao = ProductDao.INSTANCE;

    @Override
    public List<Product> findAllProducts() {
        return productDao.findProducts();
    }
}
