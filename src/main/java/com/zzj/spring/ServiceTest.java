package com.zzj.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhouzhongjian
 * @date 2019-07-25 19:46
 */


public class ServiceTest {


    public void setDaoTest(DaoTest daoTest) {
        this.daoTest = daoTest;
    }

    DaoTest daoTest;

    public void serviceMethod() {
        System.out.println("serviceMethod hello");
        daoTest.daoMethod();
    }


}
