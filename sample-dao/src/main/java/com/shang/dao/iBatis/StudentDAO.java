package com.shang.dao.iBatis;

import com.shang.model.iBatis.Student;
import com.shang.model.iBatis.StudentExample;
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