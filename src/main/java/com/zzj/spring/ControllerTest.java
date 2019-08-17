package com.zzj.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhouzhongjian
 * @date 2019-07-25 19:46
 */

public class ControllerTest {

    ServiceTest serviceTest;

    public void setServiceTest(ServiceTest serviceTest) {
        this.serviceTest = serviceTest;
    }


    public void controllerMethod() {
        System.out.println("this is controller method");
        serviceTest.serviceMethod();
    }
}
