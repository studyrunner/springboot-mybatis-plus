package com.example.springbootmybatisplus.service;

import com.example.springbootmybatisplus.dao.StudentDao;
import com.example.springbootmybatisplus.pojo.StudentPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    public StudentDao studentDao;




}
