package com.liuzhoustell.dao;

import com.liuzhoustell.entity.User;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.mapper.BaseMapper;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author Harvey
 * create on 2019-09-04 14:53:08
 */
@Repository
@SqlResource("User")
public interface UserDao extends BaseMapper<User> {
    /**
     * 分页查询
     */
    void queryByPage(PageQuery<User> pageQuery);
    /**
     *
     * 组合查询
     */
    List<User> select(Integer age, String name, Integer id);
}
