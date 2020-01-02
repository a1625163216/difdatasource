package com.example.mapper.test2;

import com.example.po.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface IUser2Mapper {

    @Select("select * from user")
    List<UserPo> findAll();
}
