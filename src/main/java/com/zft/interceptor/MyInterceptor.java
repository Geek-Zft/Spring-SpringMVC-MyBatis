package com.zft.interceptor;

import java.lang.reflect.Method;

/**
 * Description: Interceptor实现类
 * @author  fengtan.zhang
 * @date    2019/3/29 0029 下午 7:18
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class MyInterceptor implements Interceptor{

    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {

        System.err.println("=== before reflect ===");
        return false; // 不反射被代理对象原有方法
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("=== after reflect ===");
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("=== 取代了被代理对象的方法 ===");
    }
}
