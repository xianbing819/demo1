package com.lig.demo1.service.impl;

import com.lig.demo1.entity.User;
import com.lig.demo1.mapper.UserMapper;
import com.lig.demo1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lig
 * @Description TODO
 * @date 2022/8/6
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User add(User user) {
        userMapper.add(user);
        return user;
    }

    @Override
    public Integer delete(Long id) {
        return userMapper.delete(id);
    }

    @Override
    public User update(User user) {
        userMapper.update(user);
        return user;
    }

    @Override
    public User get(Long id) {
        return userMapper.get(id);
    }

    @Override
    public List<User> list(User user) {
        return userMapper.list(user);
    }


}
