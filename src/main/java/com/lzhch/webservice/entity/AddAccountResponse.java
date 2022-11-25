package com.lzhch.webservice.entity;

import java.io.Serializable;

//@XmlRootElement(name="addAccountResponse")  
//@XmlAccessorType(XmlAccessType.FIELD)  
//@XmlType(propOrder={"requestID","returnFlag","returnCode","returnMessage"}) 
public class AddAccountResponse implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AddAccountResponse() {}
	private String requestID="";     //请求唯一标识
	private boolean returnFlag=false;	  //处理结果标识
	private String returnCode="";	  //返回结果编号
	private String returnMessage=""; //返回结果信息
	
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public boolean isReturnFlag() {
		return returnFlag;
	}
	public void setReturnFlag(boolean returnFlag) {
		this.returnFlag = returnFlag;
	}
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
}
