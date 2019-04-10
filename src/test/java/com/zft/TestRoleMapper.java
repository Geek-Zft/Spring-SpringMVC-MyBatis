package com.zft;

import com.alibaba.fastjson.JSON;
import com.zft.mybatis.mapper.RoleMapper;
import com.zft.mybatis.util.SqlSessionFactoryUtils;
import com.zft.mybatis.vo.Role;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.BeforeClass;

import java.util.List;

public class TestRoleMapper {

    private static Logger logger = null;

    @BeforeClass
    public static void beforeClass() {
       logger = Logger.getLogger(TestRoleMapper.class);


    }

    @Test
    public void testGetRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            logger.info(JSON.toJSONString(role));
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testInsertRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("zft1");
            role.setNote("test insert");
            roleMapper.insertRole(role);
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testDeleteRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            roleMapper.deleteRole(3L);
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testGetList() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<Role> list = roleMapper.getList("zft");
            logger.info(JSON.toJSONString(list));
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
