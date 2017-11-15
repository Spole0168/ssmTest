package com.shang.dal.dao;

import com.shang.dal.model.Student;
import com.shang.dal.model.StudentExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("StudentDAO")
public class StudentDAOImpl extends SqlMapClientDaoSupport implements StudentDAO {

    public StudentDAOImpl() {
        super();
    }

    public long countByExample(StudentExample example) {
        Long count = (Long)  getSqlMapClientTemplate().queryForObject("student.countByExample", example);
        return count;
    }

    public int deleteByExample(StudentExample example) {
        int rows = getSqlMapClientTemplate().delete("student.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        Student _key = new Student();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("student.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(Student record) {
        Object newKey = getSqlMapClientTemplate().insert("student.insert", record);
        return (String) newKey;
    }

    public String insertSelective(Student record) {
        Object newKey = getSqlMapClientTemplate().insert("student.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<Student> selectByExample(StudentExample example) {
        List<Student> list = getSqlMapClientTemplate().queryForList("student.selectByExample", example);
        return list;
    }

    public Student selectByPrimaryKey(String id) {
        Student _key = new Student();
        _key.setId(id);
        Student record = (Student) getSqlMapClientTemplate().queryForObject("student.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(Student record, StudentExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("student.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(Student record, StudentExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("student.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(Student record) {
        int rows = getSqlMapClientTemplate().update("student.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(Student record) {
        int rows = getSqlMapClientTemplate().update("student.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends StudentExample {
        private Object record;

        public UpdateByExampleParms(Object record, StudentExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}