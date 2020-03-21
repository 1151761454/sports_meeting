package com.xhu.service;

import com.xhu.mapper.AdminMapper;
import com.xhu.mapper.RefereeMapper;
import com.xhu.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author maps
 * @create 2020-03-07 16:27
 */
@Service
public class RefereeService {
    @Autowired
    RefereeMapper refereeMapper;

    public List queryReferee(){
        return refereeMapper.queryReferee();
    }



}
