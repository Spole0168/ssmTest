package com.base;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * date :  2017年11月11日
 *
 * time :  下午7:32:31
 *
 * author : Spole
 *
 */
public class BaseModel {
	public String toString() {
		Field[] fields = this.getClass().getDeclaredFields();
		StringBuffer strBuf = new StringBuffer();
		for (int i = 0; i < fields.length; i++) {
			String fieldName = fields[i].getName();
			String methodName = "get" + fieldName.substring(0, 1).toUpperCase()
					+ fieldName.substring(1);
			try {
				Method method = this.getClass().getMethod(methodName,
						new Class[] {});
				Object value = method.invoke(this, new Object[] {});
				strBuf.append(fieldName + ":");
				strBuf.append(value + "  ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return strBuf.toString();
	}
}
