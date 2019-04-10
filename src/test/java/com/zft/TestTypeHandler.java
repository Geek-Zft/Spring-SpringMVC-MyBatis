package com.zft;

import com.alibaba.fastjson.JSON;
import com.zft.mybatis.mapper.RoleMapper;
import com.zft.mybatis.util.SqlSessionFactoryUtils;
import com.zft.mybatis.vo.Role;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * Description: 测试自定义类型转换器
 * @author  fengtan.zhang
 * @date    2019/4/10 0010 下午 5:29
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class TestTypeHandler {


    private static final Logger logger = Logger.getLogger(TestTypeHandler.class);


    @Test
    public void testFindRoles() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<Role> result = roleMapper.findRoles("zft");
            logger.info(JSON.toJSONString(result));
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testFindRoles2() {
        {
            SqlSession sqlSession = null;
            try {
                sqlSession = SqlSessionFactoryUtils.openSqlSession();
                RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
                List<Role> result = roleMapper.findRoles2("test");
                logger.info(JSON.toJSONString(result));
            }finally {
                if(sqlSession != null) {
                    sqlSession.close();
                }
            }
        }
    }




}
