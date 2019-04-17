package com.zft;

import com.alibaba.fastjson.JSON;
import com.zft.mybatis.mapper.RoleMapper;
import com.zft.mybatis.util.SqlSessionFactoryUtils;
import com.zft.mybatis.vo.PageParams;
import com.zft.mybatis.vo.Role;
import com.zft.mybatis.vo.RoleParams;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.BeforeClass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            //查看运行日志，发现只调用了一次sql，于是得出，MyBatis默认开启一级缓存(使用的同一个SqlSession,一级缓存是在SqlSession上的缓存)
            logger.info(JSON.toJSONString(role)) ;
            logger.info("再获取一次role......");
            Role role1 = roleMapper.getRole(1L);
            logger.info(JSON.toJSONString(role1));
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


    @Test
    public void testFindRolesByMap() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("roleName", "zft");
            paramMap.put("note", "test");
            List<Role> result = roleMapper.findRolesByMap(paramMap);
            logger.info(JSON.toJSONString(result));
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }


    @Test
    public void testFindRolesByAnnotation() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<Role> result = roleMapper.findRolesByAnnotation("zft", "test");
            logger.info(JSON.toJSONString(result));
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testFindRolesByBean() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RoleParams params = new RoleParams();
            params.setRoleName("zft");
            List<Role> result = roleMapper.findRolesByBean(params);
            logger.info(JSON.toJSONString(result));
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testFindByMix() {

        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RoleParams params = new RoleParams();
            params.setRoleName("zft");
            PageParams pageParams = new PageParams();
            pageParams.setStart(0);
            pageParams.setLimit(1);
            List<Role> result = roleMapper.findByMix(params, pageParams);
            logger.info(JSON.toJSONString(result));
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }


    @Test
    public void testFindByRowBounds() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RowBounds rowBounds = new RowBounds(0, 1);
            List<Role> result = roleMapper.findByRowBounds("zft", "test", rowBounds);
            logger.info(JSON.toJSONString(result));
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void testL2Cache() {
        SqlSession sqlSession = null;
        SqlSession sqlSession2 = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            sqlSession2 = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            //此处不commit，不会有缓存出现
            sqlSession.commit();
            logger.info(JSON.toJSONString(role));
            logger.info("不同SqlSession再获取一次POJO.........");
            RoleMapper mapper = sqlSession2.getMapper(RoleMapper.class);
            Role role1 = mapper.getRole(1L);
            sqlSession2.commit();
            logger.info(JSON.toJSONString(role1));
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
            if(sqlSession2 != null) {
                sqlSession2.close();
            }
        }
    }

    @Test
    public void testTestIf() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.testIf(1L);
            logger.info(JSON.toJSONString(role));
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }


    @Test
    public void testTestSet() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role1 = new Role();
            role1.setId(1L);
            role1.setRoleName("ttt");
            role1.setNote(null);
            int i = roleMapper.testSet(role1);
            logger.info(JSON.toJSONString(i));
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }

        }
    }

}
