package com.cloudm.c.service;

import com.cloudm.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "service-user",fallback = SchedualServiceHiHystric.class)
@Service
public interface SchedualServiceHi {
    @RequestMapping(value = "/user/hello",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);
    @RequestMapping(value = "/user/findAll")
    List<User> findAll();
}
