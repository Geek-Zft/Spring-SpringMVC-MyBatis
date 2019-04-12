package com.zft.mybatis;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Properties;

/**
 * Description: 自定义对象工厂
 * @author  fengtan.zhang
 * @date    2019/4/12 0012 下午 3:53
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class MyObjectFactory extends DefaultObjectFactory{

    private static final long serialVersionUID = 3163277852398920994L;


    Logger logger = Logger.getLogger(MyObjectFactory.class);

    private Object temp = null;

    //方法2
    @Override
    public <T> T create(Class<T> type) {
        T result = super.create(type);
        logger.info("创建对象：--->" + result);
        logger.info("是否和上次创建的是同一个对象：--->" + (temp == result));
        return result;
    }

    //方法1
    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        T result = super.create(type, constructorArgTypes, constructorArgs);
        logger.info("创建对象：--->" + result.toString());
        temp = result;
        return result;
    }

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        logger.info("初始化参数： " + properties.toString());
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return super.isCollection(type);
    }
}
