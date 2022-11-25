package com.lzhch.webservice.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 刘志超
 * @date 2019-03-14 下午4:43:41
 * @version 类说明
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6389330943238460295L;
	private String userId;
	private String username;
	private String age;
	private Date updateTime;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
