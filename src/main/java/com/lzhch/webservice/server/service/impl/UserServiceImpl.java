package com.lzhch.webservice.server.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import com.lzhch.webservice.entity.User;
import com.lzhch.webservice.server.service.IUserService;

/**
 * @author 刘志超
 * @date 2019-03-14 下午4:50:32
 * @version 类说明
 */

/**
 * @author 刘志超
 * @WebService 它是一个注解, 用于类上表示将该类发布为一个webservice.
 * -service Name:发布的web服务的名字,对应wsdl文档中service的名称
 * 默认缺省值为 类名+Service.
 * -name:此属性的值包含XML Web Service的名称,对应wsdl文档中portType的名称
 * 默认缺省值为Java类或接口的非限定名称.
 * -targetNamespace:命名空间,对应wsdl文档中targetNamespace,在<definitions>标签中
 * 默认缺省值为 接口实现类的包名的反缀
 * -endpointInterface:服务接口全路径,指定做SEI(Service Endpoint Interface)服务端点接口
 * -portName:对应wsdl文档中port的名称,默认缺省值为 WebService.name+Port.
 * -wsdlLocation:用于定义WebService的wsdl文档的web地址,地址可以是相对路径和绝对路径
 * 默认是 访问地址+?wsdl
 * @date 2019-03-25 上午9:46:56
 */
@WebService(
        serviceName = "userService",
        targetNamespace = "http://impl.service.server.webservice.lzhch.com",
        endpointInterface = "com.lzhch.webservice.server.service.IUserService")
public class UserServiceImpl implements IUserService {

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
        return "liyd-" + userId;
    }

    @Override
    public User getUser(String userId) {
        System.out.println("userMap是:" + userMap);
        return userMap.get(userId);
    }

}
