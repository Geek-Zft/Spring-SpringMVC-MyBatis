package com.zft.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description: 在JDK动态代理中使用拦截器
 * @author  fengtan.zhang
 * @date    2019/3/29 0029 下午 7:30
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class InterceptorJdkProxy implements InvocationHandler{

    private Object target; //真实对象

    private String interceptorClass = null; //拦截器全限类名

    public InterceptorJdkProxy(Object target, String interceptorClass) {
        this.target = target;
        this.interceptorClass = interceptorClass;
    }


    /**
     * 建立绑定关系，并返回代理对象
     * @param target    真实对象
     * @param interceptorClass   拦截器全限类名
     * @return  代理对象
     */
    public static Object bind (Object target, String interceptorClass) {

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),
                new InterceptorJdkProxy(target,interceptorClass));

    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        if(interceptorClass == null) {
            //没有设置拦截器则直接反射原有方法
            return method.invoke(target,args);
        }

        Object result = null;

        //通过反射生成拦截器
        Interceptor interceptor =
                (Interceptor) Class.forName(interceptorClass).newInstance();
        //设置前置方法
        if(interceptor.before(proxy,target,method,args)) {
            //反射原有对象方法
            result = method.invoke(target,args);
        }else {
            interceptor.around(proxy,target,method,args);
        }

        //调用后置方法
        interceptor.after(proxy,target,method,args);

        return result;
    }
}
