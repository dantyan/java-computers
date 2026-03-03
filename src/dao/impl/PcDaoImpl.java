package dao.impl;

import dao.DbHelper;
import dao.PcDao;
import models.dto.ModelSpeedHdDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PcDaoImpl implements PcDao {
    @Override
    public List<ModelSpeedHdDto>    findModelSpeedHdDtosByPrice(double price) {
        Connection connection = DbHelper.INSTANCE.getConnection();

        List<ModelSpeedHdDto> modelSpeedHdDtos = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement("select model, speed, hd from pc where price < ?;");
            ps.setDouble(1, price);

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                String model = resultSet.getString(1);
                int speed = resultSet.getInt(2);
                double hd = resultSet.getDouble(3);
                ModelSpeedHdDto modelSpeedHdDto = new ModelSpeedHdDto(model, speed, hd);
                modelSpeedHdDtos.add(modelSpeedHdDto);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return modelSpeedHdDtos;
    }
}
