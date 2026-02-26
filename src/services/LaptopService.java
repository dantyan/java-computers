package services;

import models.Laptop;
import services.impl.LaptopServiceImpl;

import java.util.List;

public interface LaptopService {

    LaptopService INSTANCE = new LaptopServiceImpl();

    List<Laptop> findAllLaptops();
}
