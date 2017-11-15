package com.base;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.ibatis.sqlmap.client.SqlMapClient;

public abstract class BaseDao {
	protected Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	protected SqlMapClient sqlMap;
	
	protected String nameSpace;
	
	
}
