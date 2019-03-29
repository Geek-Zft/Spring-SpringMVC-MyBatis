package com.zft.proxy;

import com.zft.reflect.ReflectServiceImpl;

/**
 * Description: 测试CGLIB动态代理
 * @author  fengtan.zhang
 * @date    2019/3/29 0029 下午 6:54
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class TestCGLIBProxy {


    public static void main(String[] args) {
        CglibProxyExample cglibProxyExample = new CglibProxyExample();
        ReflectServiceImpl reflectService = (ReflectServiceImpl) cglibProxyExample.getProxy(ReflectServiceImpl.class);
        reflectService.sayHello("Geek-Z");
    }
}
