package services;

import models.dto.ModelSpeedHdDto;
import services.impl.PcServiceImpl;

import java.util.List;

public interface PcService {

    PcService INSTANCE = new PcServiceImpl();

    List<ModelSpeedHdDto> findModelSpeedHdDtosByPrice(double price);
}
