package com.zzj.springMvc.service;

import com.zzj.entity.City;

/**
 * @author zhouzhongjian
 * @date 2019-07-26 17:39
 */


public interface MyDao {

    City getCityById(int id);

    int insert(City city);
}
