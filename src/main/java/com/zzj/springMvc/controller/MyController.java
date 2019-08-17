package com.zzj.springMvc.controller;


import com.alibaba.fastjson.JSON;
import com.zzj.entity.City;

import com.zzj.springMvc.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhouzhongjian
 * @date 2019-07-25 20:52
 */


@Controller
public class MyController {

    @Autowired
    MyService myService;


    private static Logger logger = LoggerFactory.getLogger(MyController.class);

    @RequestMapping("/hello")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView();
        int count = myService.insert();
        System.out.println(count);
        modelAndView.addObject("count", count);
        modelAndView.setViewName("test");


        logger.info(JSON.toJSONString(count));

        return modelAndView;

    }

}
