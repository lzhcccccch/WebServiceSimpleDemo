package com.liuzhichao.demo.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import com.liuzhichao.demo.entity.User;
import com.liuzhichao.demo.service.UserService;

/**
 * @author 刘志超
 * @date 2019-03-14 下午4:50:32
 * @version 类说明
 */

@WebService(
		targetNamespace="http://service.demo.liuzhichao.com/", //命名空间,一般为接口的包名倒序
		endpointInterface = "com.liuzhichao.demo.service.UserService") //接口地址
public class UserServiceImpl implements UserService {

	private Map<String, User> userMap = new HashMap<String, User>();

	public UserServiceImpl() {
		System.out.println("向实体类插入数据");
		User user = new User();
		user.setUserId("411001");
		user.setUsername("zhansan");
		user.setAge("20");
		user.setUpdateTime(new Date());
		userMap.put(user.getUserId(), user);

		user = new User();
		user.setUserId("411002");
		user.setUsername("lisi");
		user.setAge("30");
		user.setUpdateTime(new Date());
		userMap.put(user.getUserId(), user);

		user = new User();
		user.setUserId("411003");
		user.setUsername("wangwu");
		user.setAge("40");
		user.setUpdateTime(new Date());
		userMap.put(user.getUserId(), user);
	}

	@Override
	public String getName(String userId) {
		// TODO Auto-generated method stub
		return "liyd-" + userId;
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		System.out.println("userMap是:"+userMap);
		return  userMap.get(userId);
	}

}
