package com.lzhch.webservice.entity;

import java.io.Serializable;

//@XmlRootElement(name="addAccountRequest")  
//@XmlAccessorType(XmlAccessType.FIELD)  
//@XmlType() 
public class AddAccountRequest implements Serializable {
	
	private String validationCode;   //请求校验码
	private String requestID;        //请求唯一标识
	private AccountInfo accountInfo; //账号信息对象
	
	public String getValidationCode() {
		return validationCode;
	}
	public void setValidationCode(String validationCode) {
		this.validationCode = validationCode;
	}
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public AccountInfo getAccountInfo() {
		return accountInfo;
	}
	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}
}
