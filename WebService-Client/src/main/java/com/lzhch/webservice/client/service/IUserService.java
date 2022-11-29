
package com.lzhch.webservice.client.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IUserService", targetNamespace = "http://service.server.webservice.lzhch.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IUserService {


    /**
     * 
     * @param userId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getName", targetNamespace = "http://service.server.webservice.lzhch.com", className = "com.lzhch.webservice.client.service.GetName")
    @ResponseWrapper(localName = "getNameResponse", targetNamespace = "http://service.server.webservice.lzhch.com", className = "com.lzhch.webservice.client.service.GetNameResponse")
    public String getName(
        @WebParam(name = "userId", targetNamespace = "")
        String userId);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.lzhch.webservice.client.service.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://service.server.webservice.lzhch.com", className = "com.lzhch.webservice.client.service.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://service.server.webservice.lzhch.com", className = "com.lzhch.webservice.client.service.GetUserResponse")
    public User getUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}