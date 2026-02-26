package dao.impl;

import dao.DbHelper;
import dao.LaptopDao;
import models.Laptop;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LaptopDaoImpl implements LaptopDao {

    @Override
    public List<Laptop> findLaptops() {
        Connection connection = DbHelper.INSTANCE.getConnection();
        List<Laptop> laptops = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select code, model, speed, ram, hd, price, screen from laptop;");
            while (resultSet.next()){
                Integer code = resultSet.getInt("code");
                String model = resultSet.getString("model");
                int speed = resultSet.getInt("speed");
                int ram = resultSet.getInt("ram");
                double hd = resultSet.getDouble("hd");
                double price = resultSet.getDouble("price");
                int screen = resultSet.getInt("screen");
                Laptop  laptop = new Laptop(code,model,speed,ram,hd,price,screen);
                laptops.add(laptop);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return laptops;
    }
}
