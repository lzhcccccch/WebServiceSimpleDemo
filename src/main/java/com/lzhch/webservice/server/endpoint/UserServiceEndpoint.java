package com.lzhch.webservice.server.endpoint;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

import com.lzhch.webservice.server.service.IAppAccountService;
import com.lzhch.webservice.server.service.IUserService;
import com.lzhch.webservice.server.service.impl.AppAccountServiceImpl;
import com.lzhch.webservice.server.service.impl.UserServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * webservice 服务端, 负责发布服务
 *
 * @author 刘志超
 * @version 1.0.1
 * @date 2019-03-14 下午5:15:08
 */
@Configuration
public class UserServiceEndpoint {

    /**
     * 设置 dispatcherServlet
     *
     * @return ServletRegistrationBean<CXFServlet>
     * @author: lzhch 2022/11/25 10:19
     */
    @Bean
    public ServletRegistrationBean<CXFServlet> dispatcherServlet() {
        // CXFServlet: apache 的一款 webservice 引擎.
        return new ServletRegistrationBean<>(new CXFServlet(), "/demo/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    /**
     * 发布服务
     * Endpoint 此类为端点服务类, 它的 publish() 方法用于将一个已经添加了 @Webservice 注解的对象绑定到一个地址的端口上.
     * 发布的方法不能重名，即使不在同一个类中，也不能重名，否则会找不到服务
     * 发布的方法的 wsdl 访问地址: IP+port/URLMapping?wsdl
     *
     * 发布的方式:
     *  endpoint1: 在当前类中定义 bean, 直接使用
     *  endpoint2: 直接 new 接口实现类
     */

    @Bean
    public IUserService userService() {
        return new UserServiceImpl();
    }

    /**
     * 发布 UserService 服务相关的方法
     * @return Endpoint
     * @author: lzhch 2022/11/25 14:34
     */
    @Bean
    public Endpoint endpoint1() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), userService());
        // http://localhost:8080/demo/user?wsdl
        endpoint.publish("/user");
        return endpoint;
    }

    @Bean
    public Endpoint endpoint2() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), new AppAccountServiceImpl());
        endpoint.publish("/accountInfo1");
        return endpoint;
    }

}
