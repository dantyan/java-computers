package services;

import models.Laptop;
import models.dto.ModelRamScreenDto;
import services.impl.LaptopServiceImpl;

import java.util.List;

public interface LaptopService {

    LaptopService INSTANCE = new LaptopServiceImpl();

    List<Laptop> findAllLaptops();
    List<ModelRamScreenDto> findModelRamScreenDtosByPrice(double price);
}
