package services.impl;

import dao.LaptopDao;
import models.Laptop;
import models.dto.ModelRamScreenDto;
import models.dto.ModelSpeedHdDto;
import services.LaptopService;

import java.util.ArrayList;
import java.util.List;

public class LaptopServiceImpl implements LaptopService {

    LaptopDao laptopDao = LaptopDao.INSTANCE;
    @Override
    public List<Laptop> findAllLaptops() {
        return laptopDao.findLaptops();
    }

    @Override
    public List<ModelRamScreenDto> findModelRamScreenDtosByPrice(double price) {
        List<Laptop> laptops = findAllLaptops();
//        List<ModelRamScreenDto> list = new ArrayList<>();
//
//        for (Laptop laptop:laptops){
//            ModelRamScreenDto modelRamScreenDto = new ModelRamScreenDto();
//            modelRamScreenDto.setScreen(laptop.getScreen());
//            modelRamScreenDto.setModel(laptop.getModel());
//            modelRamScreenDto.setRam(laptop.getRam());
//            list.add(modelRamScreenDto);
//        }

        List<ModelRamScreenDto> list = laptops.stream()
                .map(x->new ModelRamScreenDto(x.getModel(), x.getRam(), x.getScreen()))
                .toList();

        return list;
    }


}
