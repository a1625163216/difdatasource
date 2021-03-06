package com.example.controller;

import com.example.po.UserPo;
import com.example.service.User1Service;
import com.example.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/** 
* @Description:  
* @Author: xt 
* @Date: 2020/1/2 
*/
@RestController
public class TestController {

    @Autowired
    private User1Service user1Service;

    @Autowired
    private User2Service user2Service;

    @RequestMapping("/user1")
    public Object user1Controller() {

        List<UserPo> all = user1Service.findAll();

        return all;
    }

    @RequestMapping("/user2")
    public Object user2Controller() {

        List<UserPo> all = user2Service.findAll();

        return all;
    }
}
