package com.example.springbootmybatisplus.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentPojo {

    public Integer id;

    public String name;

    public String age;

    public Date addDate;

    public String school;
}
