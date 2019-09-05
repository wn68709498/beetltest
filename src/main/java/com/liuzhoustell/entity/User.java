package com.liuzhoustell.entity;

import java.util.Date;
import lombok.*;
import org.beetl.sql.core.TailBean;
import org.beetl.sql.core.annotatoin.Table;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author Harvey
 * create on 2019-09-04 14:53:08
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "user")
public class User extends TailBean implements Serializable {
    private static final long serialVersionUID = -31005182142709726L;
    private Integer id;
    private String name;
    private Integer age;
    private Date createDate;

}