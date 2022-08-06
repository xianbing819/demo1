package com.lig.demo1.service;

import com.lig.demo1.entity.User;

import java.util.List;

/**
 * @author lig
 * @Description TODO
 * @date 2022/8/6
 */
public interface IUserService {

    /**
     * 添加用户
     * @param user
     * @return
     */
    User add(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    Integer delete(Long id);

    /**
     * 修改用户
     * @param user
     * @return
     */
    User update(User user);

    /**
     * 查询用户
     * @param id
     * @return
     */
    User get(Long id);

    List<User> list(User user);
}
