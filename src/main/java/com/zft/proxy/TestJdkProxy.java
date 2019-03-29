package com.zft.proxy;
/**
 * Description: 测试JDK动态代理
 * @author  fengtan.zhang
 * @date    2019/3/29 0029 下午 1:36
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class TestJdkProxy {


    public static void main(String[] args) {
        JdkProxyExample jdk = new JdkProxyExample();
        //绑定关系，因为挂在接口HelloWorld下，所以声明代理对象HelloWorld proxy
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
        //注意，此时HelloWorld对象已经是一个代理对象，它会进入代理的逻辑方法invoke里
        proxy.sayHelloWorld();
    }
}
