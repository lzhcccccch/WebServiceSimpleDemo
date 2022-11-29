package com.lzhch.webservice.server.endpoint;

import com.lzhch.webservice.server.service.IUserService;
import com.lzhch.webservice.server.service.impl.AppAccountServiceImpl;
import com.lzhch.webservice.server.service.impl.UserServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

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
     * <p>
     * 这里需要注意  由于springmvc 的核心类 为DispatcherServlet
     * 此处若不重命名此bean的话 原本的mvc就被覆盖了。可查看配置类：DispatcherServletAutoConfiguration
     * 一种方法是修改方法名称 或者指定bean名称
     * 这里需要注意 若beanName命名不是 cxfServletRegistration 时，会创建两个CXFServlet的。
     * 具体可查看下自动配置类：Declaration org.apache.cxf.spring.boot.autoconfigure.CxfAutoConfiguration
     * 也可以不设置此bean 直接通过配置项 cxf.path 来修改访问路径的
     *
     * @return ServletRegistrationBean<CXFServlet>
     * @author: lzhch 2022/11/25 10:19
     */
    @Bean
    public ServletRegistrationBean<CXFServlet> dispatcherServlet() {
        // CXFServlet: apache 的一款 webservice 引擎.
        // 注册 servlet 拦截 /demo 开头的请求 不设置 默认为：/services/*
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
     * <p>
     * 发布的方式:
     * endpoint1: 在当前类中定义 bean, 直接使用
     * endpoint2: 直接 new 接口实现类
     * endpoint3: 实现类上加 @Service 注解
     */

    @Bean
    public IUserService userService() {
        return new UserServiceImpl();
    }

    /**
     * 发布 UserService 服务相关的方法
     *
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
