package dao;

import dao.impl.DbHelperImpl;

import java.sql.Connection;

public interface DbHelper {

    DbHelper INSTANCE = new DbHelperImpl();

    Connection getConnection();
}
