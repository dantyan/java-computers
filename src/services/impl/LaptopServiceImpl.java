package services.impl;

import dao.LaptopDao;
import models.Laptop;
import services.LaptopService;

import java.util.List;

public class LaptopServiceImpl implements LaptopService {

    LaptopDao laptopDao = LaptopDao.INSTANCE;
    @Override
    public List<Laptop> findAllLaptops() {
        return laptopDao.findLaptops();
    }
}
