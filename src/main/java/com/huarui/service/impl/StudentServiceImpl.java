package com.huarui.service.impl;

import com.huarui.entity.Student;
import com.huarui.mapper.StudentMapper;
import com.huarui.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 奉劲秋
 * @since 2022-04-15
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired
    private  StudentMapper studentMapper;
    @Override
    public Student querybyid() {
        return studentMapper.querybyid();
    }
}
