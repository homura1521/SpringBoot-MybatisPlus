package com.huarui.mapper;

import com.huarui.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 奉劲秋
 * @since 2022-04-15
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    Student querybyid();
}
