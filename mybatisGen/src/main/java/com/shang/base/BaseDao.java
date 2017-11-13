package com.shang.base;

import java.util.List;

/**
 * date :  2017年11月11日
 *
 * time :  下午2:47:42
 *
 * author : Spole
 * @param <T>
 *
 */
public interface BaseDao<T> {
	 public T selectByPrimaryKey(Integer id);  
	  
	    public int deleteByPrimaryKey(Integer id);  
	  
	    public int insertSelective(T t);  
	  
	    public int updateByPrimaryKeySelective(T t);  
	  
	    public List<T> getList(T t);  
	  
	    // 获取数量  
	    public int getCountSelective(T t);  
	  
	}  
