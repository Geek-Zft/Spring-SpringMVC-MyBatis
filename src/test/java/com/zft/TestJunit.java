package com.zft;
import com.alibaba.fastjson.JSON;
import com.zft.mybatis.mapper.RoleMapper;
import com.zft.mybatis.util.MybatisUtil;
import com.zft.mybatis.vo.Role;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
/**
 * Description: 测试Junit
 * @author  fengtan.zhang
 * @date    2019/4/10 0010 下午 2:16
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class TestJunit {



    @Test
    public void testJunit() {
        SqlSessionFactory factory = MybatisUtil.getSqlSessionFactory();
        SqlSession sqlSession = factory.openSession();
        //SqlSession获取Mapper接口并发送SQL
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        Role role = roleMapper.getRole(1L);
        System.out.println(JSON.toJSONString(role));
    }
}
