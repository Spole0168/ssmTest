package com.shang.service.test;

import java.io.File;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.utils.HelpUtils;

public class TestService {
	static String urlp1 = "http://10.166.10.111:20010/credit-service/posone";
	static String urlyb = "http://10.166.10.111:20010/credit-service/pharmacistGang";
	static String urlp2 = "http://10.166.10.111:20010/credit-service/postwo";
	
	@Test
	public void test_posone(){
		File file = new File("D://apps//ExcelTemplate//CreditJson.txt");
		String fstr = HelpUtils.readFileByLines(file);
		JSONObject jsonParam = (JSONObject) JSON.parse(fstr);
		String creditService = "";
		try {
			creditService = HelpUtils.getCreditService(urlyb, jsonParam);
		} catch (Exception e) {
			System.err.println("ERROR------");
		}
		System.out.println("Test="+creditService);
	}
	@Test
	public void test_postwo(){
		File file = new File("D://apps//ExcelTemplate//postwo.txt");
		String fstr = HelpUtils.readFileByLines(file);
		JSONObject jsonParam = (JSONObject) JSON.parse(fstr);
		String creditService = "";
		try {
			creditService = HelpUtils.getCreditService(urlyb, jsonParam);
		} catch (Exception e) {
			System.err.println("ERROR------");
		}
		System.out.println("Test="+creditService);
	}
	@Test
	public void test_pharmacistGang(){
		File file = new File("D://apps//ExcelTemplate//CreditJson.txt");
		String fstr = HelpUtils.readFileByLines(file);
		JSONObject jsonParam = (JSONObject) JSON.parse(fstr);
		String creditService = "";
		try {
			creditService = HelpUtils.getCreditService(urlyb, jsonParam);
		} catch (Exception e) {
			System.err.println("ERROR------");
		}
		System.out.println("Test="+creditService);
	}
	@Test
	public void test_Json(){
		File file = new File("D://apps//ExcelTemplate//CreditJson.txt");
		String fstr = HelpUtils.readFileByLines(file);
		JSONObject jsonParam = (JSONObject) JSON.parse(fstr);
		String creditService = "";
		try {
			creditService = HelpUtils.getCreditService("http://127.0.0.1:9595/demo/jsonService/test.do", jsonParam);
		} catch (Exception e) {
			System.err.println("ERROR------");
		}
		System.out.println("Test="+creditService);
	}
	
	
}
