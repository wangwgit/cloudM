package com.cloudM.web.controller;


import com.cloudM.utils.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by wangweip on 2018/4/10.
 */

@RestController
@RequestMapping("/hello")
public class HelloController {
    private static final Logger log= LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/getDate")
    public Date getDate()
    {
        log.info("xxx");
        return DateUtil.getDate();
    }
}
