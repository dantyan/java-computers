package dao;

import dao.impl.LaptopDaoImpl;
import models.Laptop;

import java.util.List;

public interface LaptopDao {

    LaptopDao INSTANCE = new LaptopDaoImpl();

    List<Laptop> findLaptops();
}
