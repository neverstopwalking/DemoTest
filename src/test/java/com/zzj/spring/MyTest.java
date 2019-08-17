package com.zzj.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhouzhongjian
 * @date 2019-07-25 20:00
 */
public class MyTest {


    @Before
    public void beforeMethod() {
        System.out.println("before");
    }

    @Test
    public void test() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-service.xml");
//        ControllerTest controllerTest = (ControllerTest) context.getBean("controllerTest");
//
//        controllerTest.controllerMethod();

    }


    @After
    public void after() {
        System.out.println("after");
    }


}
