package com.liuzhichao.demo.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.liuzhichao.demo.entity.AddAccountRequest;
import com.liuzhichao.demo.entity.AddAccountResponse;


@WebService
public interface IAppAccountService {
	/*@WebMethod
	public boolean checkValidationCode(String str);
	
	@WebMethod
	public boolean checkAccountInfo(AccountInfo accountInfo);*/
	
	@WebMethod(operationName="AddAccount")//不能与方法同名,且返回参数名字为值+Response
//	@WebResult(name="AddAccountResult") //返回值的name值
//	webservice接口生成wsdl文档默认将方法名字+Response作为返回值的name值
	public AddAccountResponse addAccount(@WebParam(name="request") AddAccountRequest request);
}
