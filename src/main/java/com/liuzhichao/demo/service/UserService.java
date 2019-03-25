package com.liuzhichao.demo.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.liuzhichao.demo.entity.User;

/**
* @author 刘志超
* @date 2019-03-14 下午4:48:44
* @version 
* 类说明   
*/
@WebService
public interface UserService {

	/**
	 * 该类中的方法供客户端调用
	 * 类上添加@WebService注解,类中所有的非静态方法都会被发布
	 * 静态方法和final方法不会被发布,方法上加@WebMentod(exclude=true)不被发布
	 */
	
	
	@WebMethod
	String getName(@WebParam(name = "userId") String userId);
	@WebMethod
	User getUser(String userId);
	
	/**
	 * @WebMethod 注释表示作为一项WebService操作方法
	 * 			将此注释应用于客户机或服务器服务端点接口(SEI)上的方法
	 *  		或者应用于JavaBeans端点的服务器端点实现类
	 * -operationName:指定与此方法相匹配的wsdl:operation的名称
	 * 				  默认缺省值为Java方法的名称,所以不能与方法同名
	 * -action:定义此操作的行为.对于SOAP绑定,此值将确定SOAPAction头的值
	 * 		   默认缺省值为Java方法的名称
	 * -exclude:指定是否从 WebService中排除某一方法,即是否进行发布
	 * 			默认缺省值为 false,即默认为发布
	 * 
	 */
	
	/**
	 * @WebResult 注释用于定制从返回值至WSDL部件或 XML元素的映射
	 * 			将此注释应用于客户机或服务器服务端点接口(SEI)上的方法
	 * 			或者应用于JavaBeans端点的服务器端点实现类
	 *  -name:当返回值列示在 WSDL文件中并且在连接上的消息中找到该返回值时,指定该返回值的名称
	 *  	对于RPC绑定,这是用于表示返回值的 wsdl:part属性的名称
	 *  	对于文档绑定,是用于表示返回值的XML元素的局部名
	 *  	对于RPC和DOCUMENT/WRAPPED绑定,缺省值为 return
	 *  	对于DOCUMENT/BARE绑定,缺省值为方法名 Response.
	 *  -targetNamespace:指定返回值的XML名称空间 
	 *  		仅当操作类型为RPC或者操作是文档类型并且参数类型为BARE时才使用此参数.
	 *  -header:指定头中是否附带结果,默认缺省值为false.
	 *  -partName:指定RPC或DOCUMENT/BARE操作的结果的部件名称,默认缺省值为@WebResult.name.
	 *  
	 *  	返回值只是解释说明,并不会进行调用等,因为客户端并不知道服务端的具体返回值
	 *   	所以在生成的wsdl文件中要进行说明返回的是什么类型等
	 */
	
	/**
	 * @WebParam 注释用于定制从单个参数至Web Service消息部件和XML元素的映射
	 * 			将此注释应用于客户机或服务器服务端点接口(SEI)上的方法
	 * 			或者应用于JavaBeans端点的服务器端点实现类.
	 *  -name:参数的名称
	 *  	如果操作是远程过程调用(RPC)类型并且未指定partName属性
	 *  		那么这是用于表示参数的wsdl:part属性的名称.
	 *  	如果操作是文档类型或者参数映射至某个头
	 *  		那么是用于表示该参数的XML元素的局部名称
	 *  	如果操作是文档类型、参数类型为BARE并且方式为OUT或INOUT
	 *  		那么必须指定此属性.
	 */
}
