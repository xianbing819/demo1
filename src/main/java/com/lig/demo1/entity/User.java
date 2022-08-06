package com.lig.demo1.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author lig
 * @Description 用户
 * @date 2022/8/6
 */
@Data
public class User {

    /**
     * id
     */
    private Long id;

    /**
     * name
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 地址
     */
    private String address;

    /**
     * 生日
     */
    private Date birthday;

}
