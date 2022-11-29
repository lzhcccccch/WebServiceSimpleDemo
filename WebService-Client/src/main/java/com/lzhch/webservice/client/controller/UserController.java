package com.lzhch.webservice.client.controller;

import com.lzhch.webservice.client.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * TODO
 * <p>
 * author: lzhch
 * version: v1.0
 * date: 2022/11/25 16:59
 */

@RestController
@RequestMapping(value = "user")
public class UserController {

    @GetMapping(value = "getName")
    public String getName(String userId) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/demo/user?wsdl");
        /** QName 表示 XML 规范中定义的限定名称,QName 的值包含名称空间 URI、本地部分和前缀 */
        QName qName = new QName("http://impl.service.server.webservice.lzhch.com", "userService");
        javax.xml.ws.Service service = javax.xml.ws.Service.create(url, qName);
        IUserService userService = service.getPort(IUserService.class);
        return userService.getName(userId);
    }

    // @GetMapping(value = "getUser")
    // public User getUser(String userId) {
    //     return this.userService.getUser(userId);
    // }

}
