package com.zft.chainOfResponsibility;

import com.zft.interceptor.Interceptor;

import java.lang.reflect.Method;
/**
 * Description: interceptor 1
 * @author  fengtan.zhang
 * @date    2019/3/30 0030 下午 12:21
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class Interceptor1 implements Interceptor{
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("=== 拦截器1的before===");
        return true;
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {

        System.out.println("=== 拦截器1的after===");
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {

    }
}
