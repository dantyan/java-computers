package dao;

import dao.impl.PcDaoImpl;
import models.dto.ModelSpeedHdDto;

import java.util.List;

public interface PcDao {

    PcDao INSTANCE = new PcDaoImpl();

    List<ModelSpeedHdDto> findModelSpeedHdDtosByPrice(double price);
}
