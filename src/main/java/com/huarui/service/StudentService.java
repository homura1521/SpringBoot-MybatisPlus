package com.huarui.service;

import com.huarui.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 奉劲秋
 * @since 2022-04-15
 */
public interface StudentService extends IService<Student> {
    Student querybyid();
}
