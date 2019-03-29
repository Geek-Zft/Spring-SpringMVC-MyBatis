package com.zft.interceptor;

import java.lang.reflect.Method;

/**
 * Description: 定义拦截器接口
 * @author  fengtan.zhang
 * @date    2019/3/29 0029 下午 7:16
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public interface Interceptor {

    //----------------------------------------------------------
    //  3个方法参数说明：proxy代理对象、target真实对象、method方法、args运行方法参数
    //  before(); if true 反射真实对象方法 else 调用around方法
    //  反射真实对象方法或者around方法执行之后，调用after();
    //----------------------------------------------------------
    boolean before(Object proxy, Object target, Method method, Object[] args);

    void after(Object proxy, Object target, Method method, Object[] args);

    void around(Object proxy, Object target, Method method, Object[] args);

}
