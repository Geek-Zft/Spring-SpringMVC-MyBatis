package com.zft.proxy;

public class TestJdkProxy {


    public static void main(String[] args) {
        JdkProxyExample jdk = new JdkProxyExample();
        //绑定关系，因为挂在接口HelloWorld下，所以生命代理对象HelloWorld proxy
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
        //注意，此时HelloWorld对象已经是一个代理对象，它会进入代理的逻辑方法invoke里
        proxy.sayHelloWorld();
    }
}
