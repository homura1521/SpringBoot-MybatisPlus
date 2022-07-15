package com.huarui;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.huarui.entity.Student;
import com.huarui.mapper.StudentMapper;
import com.huarui.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class SpringbootmybatisplusApplicationTests {
    @Autowired
    private  StudentService studentService;
    @Test
    void contextLoads() {
//        UpdateWrapper<Student> wrapper = new UpdateWrapper<>();
//        wrapper.eq("name", "111");
//        //注意这个只用于设置sql语句的set部分
//        wrapper.setSql("age='18'");
//        Student student = new Student();
//         student.setName("我是你爹");
//        boolean update = studentService.update(student, wrapper);
       Student student= studentService.querybyid();
        System.out.println(student);

    }
}
