package com.shang.service.test;

import java.io.File;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.utils.HelpUtils;

public class TestService {
	static String url = "http://10.166.10.111:20010/credit-service/antiFraud";
	
	@Test
	public void test_Fruad(){
		File file = new File("D://apps//ExcelTemplate//CreditJson.txt");
		String fstr = HelpUtils.readFileByLines(file);
		JSONObject jsonParam = (JSONObject) JSON.parse(fstr);
		String creditService = "";
		try {
			creditService = HelpUtils.getCreditService(url, jsonParam);
		} catch (Exception e) {
			System.err.println("ERROR------");
		}
		System.out.println("Test"+creditService);
	}
	
	
}
