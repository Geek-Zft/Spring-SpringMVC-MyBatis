package com.zft;


import com.alibaba.fastjson.JSON;
import com.zft.mybatis.mapper.UserMapper;
import com.zft.mybatis.util.SqlSessionFactoryUtils;
import com.zft.mybatis.vo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


/**
 * Description: 测试 SexEnumTypeHandler
 * @author  fengtan.zhang
 * @date    2019/4/11 0011 下午 5:36
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class TestSexEnumTypeHandler {

    private static final Logger logger = Logger.getLogger(TestSexEnumTypeHandler.class);


    @Test
    public void testGetUser() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User result = userMapper.getUser(1L);
            logger.info(JSON.toJSONString(result));
            logger.info(JSON.toJSONString(result.getSex().getName()));
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
