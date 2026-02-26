package dao;

import dao.impl.ProductDaoImpl;
import models.Product;

import java.util.List;

public interface ProductDao {

    ProductDao INSTANCE = new ProductDaoImpl();

    List<Product> findProducts();
}
