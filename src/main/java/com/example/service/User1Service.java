package com.example.service;

import com.example.mapper.test1.IUser1Mapper;
import com.example.po.UserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("all")
public class User1Service {

    @Autowired
    private IUser1Mapper user1Mapper;

    public List<UserPo> findAll() {

        return user1Mapper.findAll();
    }
}
