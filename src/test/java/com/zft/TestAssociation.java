package com.zft;

import com.alibaba.fastjson.JSON;
import com.zft.mybatis.mapper.EmployeeMapper;
import com.zft.mybatis.util.SqlSessionFactoryUtils;
import com.zft.mybatis.vo.Employee;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Description: 测试级联
 * @author  fengtan.zhang
 * @date    2019/4/17 0017 上午 9:36
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class TestAssociation {




    private static Logger logger = null;

    @BeforeClass
    public static void beforeClass() {
        logger = Logger.getLogger(TestAssociation.class);
    }

    @Test
    public void testGetEmployee () {

        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = mapper.getEmployee(1L);
            logger.info(JSON.toJSONString(employee.getBirthday()));
        }finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }

    }
}
