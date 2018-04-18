package com.cloudm.p.controller;

import com.cloudm.model.User;
import com.cloudm.p.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/user")
public class UserPController {
    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String hello(String name)
    {
        return "xxxx"+name;
   //     return  "hello:"+name;
    }

    /**
     * 测试http://localhost:8762/user/insert?id=1&name=xx&age=11
     * @param user
     * @return
     */
    @RequestMapping("/insert")
    public int inserUser(User user)
    {
        return userService.insert(user);
    }

    /**
     * 测试http://localhost:8762/user/findByName?name=xx
     * @param name
     * @return
     */
    @RequestMapping("/findByName")
    public User findByname(String name)
    {
        return  userService.findByname(name);
    }

    /**
     * http://localhost:8762/user/update?name=xx&id=1&age=2
     * @param user
     */
    @RequestMapping("/update")
    public void update(User user)
    {
        userService.update(user);
    }

    /**
     * http://localhost:8762/user/findAll
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAll()
    {
        return userService.findAll();
    }

    /**
     * http://localhost:8762/user/testTr
     * 事物测试 service 需要增加注释：@Transactional
     */
    @RequestMapping("testTr")
    public void testTr()
    {
        userService.restTr();
    }
}
