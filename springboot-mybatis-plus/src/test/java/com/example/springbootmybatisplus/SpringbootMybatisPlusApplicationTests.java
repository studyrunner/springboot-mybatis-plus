package com.example.springbootmybatisplus;

import com.example.springbootmybatisplus.dao.StudentDao;
import com.example.springbootmybatisplus.pojo.StudentPojo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {
    @Test
    void contextLoads() {
        StudentDao studentDao = new StudentDao();
        List<StudentPojo>studentPojoList  = studentDao.getAllUsers();
        for (StudentPojo studentPojo:studentPojoList) {
            System.out.println(studentPojo.school);
        }
    }
}
