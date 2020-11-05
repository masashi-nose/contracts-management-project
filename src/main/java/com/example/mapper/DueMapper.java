package com.example.mapper;

import com.example.domain.Due;
import com.example.example.DueExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DueMapper {
    int countByExample(DueExample example);

    int deleteByExample(DueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Due record);

    int insertSelective(Due record);

    List<Due> selectByExample(DueExample example);

    Due selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Due record, @Param("example") DueExample example);

    int updateByExample(@Param("record") Due record, @Param("example") DueExample example);

    int updateByPrimaryKeySelective(Due record);

    int updateByPrimaryKey(Due record);
}