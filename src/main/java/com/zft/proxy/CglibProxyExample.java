package com.zft.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
/**
 * Description: CGLIB动态代理
 * @author  fengtan.zhang
 * @date    2019/3/29 0029 下午 1:47
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class CglibProxyExample implements MethodInterceptor{


    /**
     * 生成CGLIB增强类对象
     * @param cls  Class类
     * @return     Class类的CGLIB代理对象
     */
    public Object getProxy(Class cls) {

        //CGLIB enhancer增强类对象
        Enhancer enhancer = new Enhancer();
        //设置增强类型
        enhancer.setSuperclass(cls);
        //定义代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor方法
        enhancer.setCallback(this);
        //生成并返回代理对象
        return enhancer.create();
    }

    /**
     * 代理逻辑方法
     * @param proxy     代理对象
     * @param method    方法
     * @param args      方法参数
     * @param methodProxy   方法代理
     * @return  代理逻辑返回
     * @throws Throwable    异常
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.err.println("=====调用真实对象前=====");

        //CGLIB 反射调用真实对象方法
        Object result = methodProxy.invokeSuper(proxy,args);

        System.err.println("=====调用真实对象后=====");

        return result;
    }
}
