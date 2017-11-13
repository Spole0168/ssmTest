package com.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

import com.utils.DateTimeUtils;
import com.utils.HelpUtils;

public class TestCases {
	protected  Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void test01(){
		logger.info("message1");
		System.out.println("涓ゅ勾鍓嶆椂闂达細"+HelpUtils.markDate( 1, -2));
		System.out.println("涓ゅぉ鍓嶆椂闂达細"+HelpUtils.getDateTimeStrByCondition(HelpUtils.DTCondition.DAY, -2));
		System.out.println("涓ゅぉ鍚庢椂闂达細"+HelpUtils.getDateTimeStrByCondition(HelpUtils.DTCondition.DAY, 2));
		logger.error("message2");
	}
	@Test
	public void test02(){
		System.out.println(DateTimeUtils.getCurrentDateStr());
		
	}
	public static void main(String[] args) {
	}
}	
