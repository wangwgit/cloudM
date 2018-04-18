package com.cloudm.c.service;

import com.cloudm.model.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String hello(String name) {
        return "sorry "+name;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
