package com.example.springbootmybatisplus.dao;


import com.example.springbootmybatisplus.pojo.StudentPojo;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Repository
public class StudentDao extends ConnDao {


    public List<StudentPojo> getAllUsers() {
        List<StudentPojo> users = new ArrayList<>();
        try {
            String sql = "SELECT * FROM student";
            preparedStatement = connect.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StudentPojo studentPojo = new StudentPojo();
                studentPojo.setId(resultSet.getInt("id"));
                studentPojo.setName(resultSet.getString("name"));
                studentPojo.setSchool(resultSet.getString("school"));
                studentPojo.setAge(resultSet.getString("age"));
                studentPojo.setAddDate(resultSet.getDate("addDate"));
                users.add(studentPojo);
            }
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public void addUser(StudentPojo studentPojo) {
        try {
            String sql = "INSERT INTO users (id, name) VALUES (?, ?)";
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setInt(1, studentPojo.getId());
            preparedStatement.setString(2, studentPojo.getName());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
