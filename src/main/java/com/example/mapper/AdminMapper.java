package com.example.mapper;

import com.example.domain.Admin;
import com.example.example.AdminExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminMapper {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer id);

    public int insert(Admin admin);

    int insertSelective(Admin admin);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer id);
    
    public Admin selectByEmail(String email);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}