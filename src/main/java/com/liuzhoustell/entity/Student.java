package com.liuzhoustell.entity;

import lombok.*;
import org.beetl.sql.core.TailBean;
import org.beetl.sql.core.annotatoin.Table;
import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author Harvey
 * create on 2019-09-05 15:23:36
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "student")
public class Student extends TailBean implements Serializable {
    private static final long serialVersionUID = 696429514063158669L;
    /**
     * 学生编号
     */
    private Integer id;
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;

}