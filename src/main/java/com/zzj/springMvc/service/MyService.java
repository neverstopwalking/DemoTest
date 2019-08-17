package com.zzj.springMvc.service;

import com.zzj.entity.City;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhouzhongjian
 * @date 2019-07-25 20:52
 */

@Service
public class MyService {

    @Resource
    private MyDao myDao;


    public City getCityById(int id) {

        return myDao.getCityById(id);
    }

    public int insert() {

        City city = new City();
        city.setName("beijing");
        city.setDistrict("east java");
        city.setCountryCode("IDN");
        city.setPopulation(10000);
        int count = myDao.insert(city);
        return count;
    }
}
