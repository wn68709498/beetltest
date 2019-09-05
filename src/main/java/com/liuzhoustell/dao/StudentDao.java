package com.liuzhoustell.dao;

import com.liuzhoustell.entity.Student;
import org.beetl.sql.core.mapper.BaseMapper;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.springframework.stereotype.Repository;

/**
 * (Student)表数据库访问层
 *
 * @author Harvey
 * create on 2019-09-05 15:23:36
 */
@Repository
@SqlResource("Student")
public interface StudentDao extends BaseMapper<Student> {
    /**
     * 分页查询
     */
    void queryByPage(PageQuery<Student> pageQuery);
}