package com.base;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;

public abstract class BaseDao extends SqlMapClientDaoSupport {
	protected Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	protected SqlMapClient sqlMapClient;
	
	protected String nameSpace;
	
	
}
