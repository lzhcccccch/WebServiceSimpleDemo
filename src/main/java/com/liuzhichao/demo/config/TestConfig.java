package com.liuzhichao.demo.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.liuzhichao.demo.service.IAppAccountService;
import com.liuzhichao.demo.service.UserService;
import com.liuzhichao.demo.service.impl.AppAccountService;
import com.liuzhichao.demo.service.impl.UserServiceImpl;

/**
 * @author 刘志超
 * @date 2019-03-14 下午5:15:08
 * @version 类说明
 */
@Configuration
public class TestConfig {
	
	/*public TestConfiging() {
		System.out.println("-----------------");
		Endpoint.publish("http://localhost:8080/accountInfo", new AppAccountService());
	}*/

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public ServletRegistrationBean dispatcherServlet() {
		return new ServletRegistrationBean(new CXFServlet(), "/test/*");
	}

	@Bean(name = Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		return new SpringBus();
	}

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}
	
	/**
	 * Endpoint 此类为端点服务类,它的publish()方法用于将一个已经添加了@Webservice
	 * 注解的对象绑定到一个地址的端口上.
	 * 发布的方法不能重名，即使不在同一个类中，也不能重名，否则会找不到服务
	 * @return
	 */
	@Bean
	public Endpoint endpoint1() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), userService());
		endpoint.publish("/user");
		return endpoint;
	}
	
	/*@Bean
	public IAppAccountService iAppAccountService() {
		System.out.println("iAppAcountService");
		return new AppAccountService();
	}*/
	
	@Bean
	public Endpoint endpoint2() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), new AppAccountService());
		endpoint.publish("/accountInfo1");
		return endpoint;
		//return Endpoint.publish("http://localhost:8080/accountInfo", new AppAccountService());
	}
}
