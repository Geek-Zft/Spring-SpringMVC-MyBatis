package com.zft.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * Description: 自己生成代理类
 * @author  fengtan.zhang
 * @date    2019/3/30 0030 上午 10:26
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class GenerateProxyClass {


    public static void main(String[] args) {

        HelloWorldImpl helloWorld = new HelloWorldImpl();

        JdkProxyExample jdkProxyExample = new JdkProxyExample();
        HelloWorld proxy = (HelloWorld) jdkProxyExample.bind(helloWorld);
        proxy.sayHelloWorld();

        String path = "C:/$Proxy1.class";

        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy1",HelloWorldImpl.class.getInterfaces());

        FileOutputStream outputStream = null;

       try {
           outputStream = new FileOutputStream(path);
           outputStream.write(classFile);
           outputStream.flush();
       }catch (Exception e) {
           //skip
       } finally {
           try {
               if (outputStream != null) {
                   outputStream.close();
               }
           }catch (Exception e) {
               //skip
           }

       }

    }



}
