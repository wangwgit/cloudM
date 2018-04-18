package com.cloudm.c.controller;

import com.cloudm.c.service.SchedualServiceHi;
import com.cloudm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    /**
     * 测试地址 http://localhost:8766/hi?name=1213
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){

        return schedualServiceHi.hello(name)+"    service-feign";
    }

    /**
     * 测试地址http://localhost:8766/findAll
     * @return
     */
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<User> findAll()
    {
        return  schedualServiceHi.findAll();
    }
}