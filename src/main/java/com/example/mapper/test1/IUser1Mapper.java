package com.example.mapper.test1;

import com.example.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface IUser1Mapper {

    // @Select("select * from user")
    List<UserPo> findAll();
}
