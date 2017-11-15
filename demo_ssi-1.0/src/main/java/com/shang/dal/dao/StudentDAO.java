package com.shang.dal.dao;

import com.shang.dal.model.Student;
import com.shang.dal.model.StudentExample;
import java.util.List;

public interface StudentDAO {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(String id);

    String insert(Student record);

    String insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(String id);

    int updateByExampleSelective(Student record, StudentExample example);

    int updateByExample(Student record, StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}