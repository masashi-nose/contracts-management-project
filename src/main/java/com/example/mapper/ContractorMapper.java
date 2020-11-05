package com.example.mapper;

import com.example.domain.Contractor;
import com.example.example.ContractorExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ContractorMapper {
    int countByExample(ContractorExample example);

    int deleteByExample(ContractorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Contractor record);

    int insertSelective(Contractor record);

    List<Contractor> selectByExample(ContractorExample example);

    Contractor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Contractor record, @Param("example") ContractorExample example);

    int updateByExample(@Param("record") Contractor record, @Param("example") ContractorExample example);

    int updateByPrimaryKeySelective(Contractor record);

    int updateByPrimaryKey(Contractor record);
}