package com.shang.base;

import java.io.Serializable;

/**
 * date : 2017年11月11日
 *
 * time : 下午2:48:34
 *
 * author : Spole
 *
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
