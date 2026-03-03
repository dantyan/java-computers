package services.impl;

import dao.PcDao;
import models.dto.ModelSpeedHdDto;
import services.PcService;

import java.util.List;

public class PcServiceImpl implements PcService {



    @Override
    public List<ModelSpeedHdDto> findModelSpeedHdDtosByPrice(double price) {
        return PcDao.INSTANCE.findModelSpeedHdDtosByPrice(price);
    }
}
