package com.liuzhichao.demo.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.liuzhichao.demo.entity.User;

/**
* @author 刘志超
* @date 2019-03-14 下午4:48:44
* @version 
* 类说明   
*/
@WebService
public interface UserService {

	@WebMethod
	String getName(@WebParam(name = "userId") String userId);
	@WebMethod
	User getUser(String userId);
	
}
