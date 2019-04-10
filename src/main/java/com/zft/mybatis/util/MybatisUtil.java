package com.zft.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public final class MybatisUtil {


    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory factory = null;
        String resource = "mybatis-config.xml";
        InputStream inputStream;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }


}
