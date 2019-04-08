package com.zft.chainOfResponsibility;

import com.zft.interceptor.InterceptorJdkProxy;
import com.zft.proxy.HelloWorld;
import com.zft.proxy.HelloWorldImpl;

/**
 * Description: 测试责任链模式
 * @author  fengtan.zhang
 * @date    2019/4/8 0008 上午 9:23
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class TestChainOfResponsibility {

    //注意观察执行方法的顺序
    //before方法按照最后一个拦截器到第一个拦截器的加载顺序运行，而after方法则按照第一个拦截器到最后一个拦截器的加载顺序执行

    public static void main(String[] args) {
        HelloWorld proxy1 = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(),"com.zft.chainOfResponsibility.Interceptor1");
        HelloWorld proxy2 = (HelloWorld) InterceptorJdkProxy.bind(proxy1,"com.zft.chainOfResponsibility.Interceptor2");
        HelloWorld proxy3 = (HelloWorld) InterceptorJdkProxy.bind(proxy2,"com.zft.chainOfResponsibility.Interceptor3");
        proxy3.sayHelloWorld();
    }

}
