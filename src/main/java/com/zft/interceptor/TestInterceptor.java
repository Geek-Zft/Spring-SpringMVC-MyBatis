package com.zft.interceptor;

import com.zft.proxy.HelloWorld;
import com.zft.proxy.HelloWorldImpl;

/**
 * Description: 测试MyInterceptor拦截器
 * @author  fengtan.zhang
 * @date    2019/3/29 0029 下午 8:26
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class TestInterceptor {

    public static void main(String[] args) {
        HelloWorld proxy =
                (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(),"com.zft.interceptor.MyInterceptor");

        proxy.sayHelloWorld();
    }

}
