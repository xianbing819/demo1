package com.lig.demo1.mapper;

import com.lig.demo1.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lig
 * @Description TODO
 * @date 2022/8/6
 */
@Mapper
public interface UserMapper {


    /**
     * 添加用户
     * @param user
     * @return
     */
    void add(User user);

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
    void update(User user);

    /**
     * 查询用户
     * @param id
     * @return
     */
    User get(Long id);

    List<User> list(User user);
}