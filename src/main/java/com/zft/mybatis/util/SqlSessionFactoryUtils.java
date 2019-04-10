package com.zft.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Description: SqlSessionFactory工具类(单例模式)
 * @author  fengtan.zhang
 * @date    2019/4/10 0010 下午 2:35
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class SqlSessionFactoryUtils {


    private static final Class<SqlSessionFactoryUtils> LOCk = SqlSessionFactoryUtils.class;


    private static SqlSessionFactory sqlSessionFactory = null;

    private SqlSessionFactoryUtils() {}

    public static SqlSessionFactory getSqlSessionFactory() {

        synchronized (LOCk) {
            if(sqlSessionFactory != null) {
                return sqlSessionFactory;
            }
            String resource = "mybatis-config.xml";
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            return sqlSessionFactory;
        }

    }

    public static SqlSession openSqlSession() {
        if(sqlSessionFactory == null) {
            getSqlSessionFactory();
        }
        return sqlSessionFactory.openSession(true);
    }

}
