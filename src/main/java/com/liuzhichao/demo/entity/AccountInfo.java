package com.liuzhichao.demo.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//@XmlRootElement(name="accountInfo")  
//@XmlAccessorType(XmlAccessType.FIELD)  
//@XmlType() 
public class AccountInfo implements Serializable{
	
	private String CNPCCardNum;
	private String CNPCCommonAttr1;
	private String CNPCCommonAttr2;
	private String CNPCCommonAttr3;
	private String CNPCCommonAttr4;
	private String CNPCCommonDescription;
	private String CNPCCommonendTime;
	private String CNPCCommonGender;
	private String CNPCCommonJobName;
	private String CNPCCommonMobile;
	private String CNPCCommonNationality;
	private String CNPCCommonOrg;
	private String CNPCCommonPostion;
	private String CNPCCommonstartTime;
	private String CNPCEmployeeNumber;
	private String CNPCEmployLevel;
	private String CNPCisManager;
	private String cn;
	private String displayName;
	private String employeeType;
	private String uid;
	private String homePhone;
	private String mail;
	private String manager;
	private String ouid;
	private String postalAddress;
	private String postalCode;
	private String sn;
	private String telexNumber;
	private String title;
	private String domain;
	private String accountStatus;
	private String CNPCCommonEncryptString;
	private String password;
	
	public String getCNPCCardNum() {
		return CNPCCardNum;
	}
	public void setCNPCCardNum(String cardNum) {
		CNPCCardNum = cardNum;
	}
	public String getCNPCCommonAttr1() {
		return CNPCCommonAttr1;
	}
	public void setCNPCCommonAttr1(String commonAttr1) {
		CNPCCommonAttr1 = commonAttr1;
	}
	public String getCNPCCommonAttr2() {
		return CNPCCommonAttr2;
	}
	public void setCNPCCommonAttr2(String commonAttr2) {
		CNPCCommonAttr2 = commonAttr2;
	}
	public String getCNPCCommonAttr3() {
		return CNPCCommonAttr3;
	}
	public void setCNPCCommonAttr3(String commonAttr3) {
		CNPCCommonAttr3 = commonAttr3;
	}
	public String getCNPCCommonAttr4() {
		return CNPCCommonAttr4;
	}
	public void setCNPCCommonAttr4(String commonAttr4) {
		CNPCCommonAttr4 = commonAttr4;
	}
	public String getCNPCCommonDescription() {
		return CNPCCommonDescription;
	}
	public void setCNPCCommonDescription(String commonDescription) {
		CNPCCommonDescription = commonDescription;
	}
	public String getCNPCCommonendTime() {
		return CNPCCommonendTime;
	}
	public void setCNPCCommonendTime(String commonendTime) {
		CNPCCommonendTime = commonendTime;
	}
	public String getCNPCCommonGender() {
		return CNPCCommonGender;
	}
	public void setCNPCCommonGender(String commonGender) {
		CNPCCommonGender = commonGender;
	}
	public String getCNPCCommonJobName() {
		return CNPCCommonJobName;
	}
	public void setCNPCCommonJobName(String commonJobName) {
		CNPCCommonJobName = commonJobName;
	}
	public String getCNPCCommonMobile() {
		return CNPCCommonMobile;
	}
	public void setCNPCCommonMobile(String commonMobile) {
		CNPCCommonMobile = commonMobile;
	}
	public String getCNPCCommonNationality() {
		return CNPCCommonNationality;
	}
	public void setCNPCCommonNationality(String commonNationality) {
		CNPCCommonNationality = commonNationality;
	}
	public String getCNPCCommonOrg() {
		return CNPCCommonOrg;
	}
	public void setCNPCCommonOrg(String commonOrg) {
		CNPCCommonOrg = commonOrg;
	}
	public String getCNPCCommonPostion() {
		return CNPCCommonPostion;
	}
	public void setCNPCCommonPostion(String commonPostion) {
		CNPCCommonPostion = commonPostion;
	}
	public String getCNPCCommonstartTime() {
		return CNPCCommonstartTime;
	}
	public void setCNPCCommonstartTime(String commonstartTime) {
		CNPCCommonstartTime = commonstartTime;
	}
	public String getCNPCEmployeeNumber() {
		return CNPCEmployeeNumber;
	}
	public void setCNPCEmployeeNumber(String employeeNumber) {
		CNPCEmployeeNumber = employeeNumber;
	}
	public String getCNPCEmployLevel() {
		return CNPCEmployLevel;
	}
	public void setCNPCEmployLevel(String employLevel) {
		CNPCEmployLevel = employLevel;
	}
	public String getCNPCisManager() {
		return CNPCisManager;
	}
	public void setCNPCisManager(String cisManager) {
		CNPCisManager = cisManager;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getOuid() {
		return ouid;
	}
	public void setOuid(String ouid) {
		this.ouid = ouid;
	}
	public String getPostalAddress() {
		return postalAddress;
	}
	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getTelexNumber() {
		return telexNumber;
	}
	public void setTelexNumber(String telexNumber) {
		this.telexNumber = telexNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getCNPCCommonEncryptString() {
		return CNPCCommonEncryptString;
	}
	public void setCNPCCommonEncryptString(String commonEncryptString) {
		CNPCCommonEncryptString = commonEncryptString;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
