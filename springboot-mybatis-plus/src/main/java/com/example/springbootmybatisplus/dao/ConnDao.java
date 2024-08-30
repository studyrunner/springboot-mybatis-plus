package com.example.springbootmybatisplus.dao;

import lombok.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Data
public class ConnDao {
    public Connection connect = null;
    public PreparedStatement preparedStatement = null;
    public ResultSet resultSet = null;

    public ConnDao() {
        try {
            // 加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 建立数据库连接
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 关闭数据库连接等资源
    public void closeResources() {
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connect != null) connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
