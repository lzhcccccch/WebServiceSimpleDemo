package com.liuzhichao.demo.service.impl;

import javax.jws.WebService;

import com.liuzhichao.demo.entity.AccountInfo;
import com.liuzhichao.demo.entity.AddAccountRequest;
import com.liuzhichao.demo.entity.AddAccountResponse;
import com.liuzhichao.demo.service.IAppAccountService;

@WebService(
		serviceName="webservice",
		targetNamespace="http://service.demo.liuzhichao.com/",
		endpointInterface = "com.liuzhichao.demo.service.IAppAccountService")
public class AppAccountService implements IAppAccountService {
	
	private String validationCode = "ServiceP@ssw0rd";//应用方自定义
    private String requestID = "";
    
    private AddAccountResponse addResponse = new AddAccountResponse();
    
    
    /*public AppAccountService() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}*/

	/**
     * 校验码验证
     */
    private boolean checkValidationCode(String str) {
    	if (str != null && this.validationCode.equals(str))
			return true;
		else
            return false;
	}
    
    /**
     * 账号信息格式校验
     */
    private boolean checkAccountInfo(AccountInfo accountInfo) {
    	boolean flag = false;
    	if (accountInfo.getUid() == null || !accountInfo.getUid().endsWith("@petrochina.com.cn") || !accountInfo.getUid().endsWith("@cnpc.com.cn")) {
    		addResponse.setReturnMessage("AccountInfo Uid must be PetroChina or CNPC e-mail! Like: xxx@petrochina.com.cn");
    	}else if (accountInfo.getCn() == null || accountInfo.getCn().trim().length() == 0) {
    		addResponse.setReturnMessage("AccountInfo cn cann't be null!");
		}else
			flag = true;
    	return flag;
    }
    
    /**
	 * 1.创建账号: <4.1 创建账号>
	 */
    @Override
    public AddAccountResponse addAccount(AddAccountRequest request) {
    	AddAccountResponse addResponse = new AddAccountResponse();
    	addResponse.setRequestID(this.requestID);
//		addResponse.setReturnFlag(false);
		
    	//1.验证请求对象是否为空
		if (request == null || request.getAccountInfo() == null) {
            addResponse.setReturnCode("1");
            addResponse.setReturnMessage("addAccount failed! AddAccountRequest or AccountInfo is null!");
            return addResponse;
		}
		
    	//2.验证校验码
		if (!checkValidationCode(request.getValidationCode())) {
            addResponse.setReturnCode("2");
            addResponse.setReturnMessage("addAccount failed! Erro ValidationCode!");
            return addResponse;
		}
    	
		//3.验证字段格式
		if (!checkAccountInfo(request.getAccountInfo())) {
            addResponse.setReturnCode("3");
            addResponse.setReturnMessage("addAccount failed! " + addResponse.getReturnMessage());
            return addResponse;
		}
		
		//4.创建账号
		try {
			//4.1 查看账号是否已经存在(注: 逻辑删除的账号不在查询范围内)
			//    查询方法由应用方自行实现
			//    统一身份认证平台发起请求时的Uid字段格式：邮箱账号: (例)abc@cnpc.com.cn 或 (例)abc@petrochina.com.cn ; 普通账号: (例)abc
            //	  应用方根据自身数据结构对Uid进行拆解
			/*
			 * 此处添加查询账号方法
			 */
			
			//4.2 如果账号存在,返回错误信息
			//    示例: 此处假设账号(Uid)已存在
			/*
			if (Uid已存在) {
				addResponse.setReturnCode("4");
				addResponse.setReturnMessage("addAccount failed! Uid is exists --> " + request.getAccountInfo().getUid());
				return addResponse;
			}
			 */
		
			//4.3 如果账号不存在,创建账号
			//	  创建方法由应用方自行实现
			//    统一身份认证平台发起请求时的Uid字段格式：邮箱账号: (例)abc@cnpc.com.cn 或 (例)abc@petrochina.com.cn ; 普通账号: (例)abc
            //	  应用方根据自身数据结构对Uid进行拆解
			//	  账号状态及创建时间请应用方根据自身业务需要自行赋值
			/*
			 * 此处添加创建账号方法
			 */
			
//			addResponse.setReturnFlag(true);
            addResponse.setReturnCode("0");
            addResponse.setReturnMessage("addAccount success!");
		} catch (Exception e) {
			//账号创建失败,返回错误信息
            addResponse.setReturnCode("5");
            addResponse.setReturnMessage("addAccount failed! " + e.toString());
		}
		return addResponse;
    }
}