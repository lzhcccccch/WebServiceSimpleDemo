package com.lzhch.webservice.server.service;


import com.lzhch.webservice.server.dto.AddAccountRequest;
import com.lzhch.webservice.server.dto.AddAccountResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public interface IAppAccountService {

    @WebMethod(operationName = "AddAccount")
// 不能与方法同名,且返回参数名字为值+Response
//	@WebResult(name="AddAccountResult") //返回值的name值
//	webservice接口生成wsdl文档默认将方法名字+Response作为返回值的name值
    AddAccountResponse addAccount(@WebParam(name = "request") AddAccountRequest request);

}
