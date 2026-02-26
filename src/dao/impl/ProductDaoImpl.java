package dao.impl;

import dao.DbHelper;
import dao.ProductDao;
import models.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    @Override
    public List<Product> findProducts() {
        Connection conn = DbHelper.INSTANCE.getConnection();
        String query = "select maker, model, type from product;";
        List<Product> products = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                String maker = resultSet.getString("maker");
                String model = resultSet.getString("model");
                String type = resultSet.getString("type");
                Product product = new Product(maker, model, type);
                products.add(product);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;
    }
}
