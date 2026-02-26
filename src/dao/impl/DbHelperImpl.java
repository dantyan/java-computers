package dao.impl;

import dao.DbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelperImpl implements DbHelper {
    @Override
    public Connection getConnection() {
        String url = "jdbc:sqlite:C:\\Users\\NB-8\\Documents\\databases\\computers.db";
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url);
        }catch (SQLException e){
            throw new RuntimeException();
        }
        return connection;
    }
}
