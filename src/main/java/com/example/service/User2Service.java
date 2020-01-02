package com.example.service;

import com.example.mapper.test2.IUser2Mapper;
import com.example.po.UserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@SuppressWarnings("all")
public class User2Service {

    @Autowired
    private IUser2Mapper user2Mapper;

    public List<UserPo> findAll() {

        return user2Mapper.findAll();
    }
}
