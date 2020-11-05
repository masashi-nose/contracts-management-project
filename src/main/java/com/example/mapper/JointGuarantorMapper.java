package com.example.mapper;

import com.example.domain.JointGuarantor;
import com.example.example.JointGuarantorExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface JointGuarantorMapper {
    int countByExample(JointGuarantorExample example);

    int deleteByExample(JointGuarantorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JointGuarantor record);

    int insertSelective(JointGuarantor record);

    List<JointGuarantor> selectByExample(JointGuarantorExample example);

    JointGuarantor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JointGuarantor record, @Param("example") JointGuarantorExample example);

    int updateByExample(@Param("record") JointGuarantor record, @Param("example") JointGuarantorExample example);

    int updateByPrimaryKeySelective(JointGuarantor record);

    int updateByPrimaryKey(JointGuarantor record);
}