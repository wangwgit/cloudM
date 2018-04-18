package com.cloudm.p.service;

import com.cloudm.model.User;
import com.cloudm.p.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int insert(User user)
    {
        return userMapper.insert(user.getId(),user.getName(),user.getAge());
    }

    public User findByname(String name)
    {
        return  userMapper.findByName(name);
    }

    public void update(User user)
    {
        userMapper.update(user);
    }

    public List<User> findAll()
    {
        return userMapper.findAll();
    }

    @Transactional
    public void restTr()
    {
        userMapper.delete(1L);
        int i= 1/0;
    }
}
