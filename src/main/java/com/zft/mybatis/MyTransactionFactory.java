package com.zft.mybatis;

import org.apache.ibatis.session.TransactionIsolationLevel;
import org.apache.ibatis.transaction.Transaction;
import org.apache.ibatis.transaction.TransactionFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

/**
 * Description: 自定义事务工厂
 * @author  fengtan.zhang
 * @date    2019/4/12 0012 下午 4:22
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class MyTransactionFactory implements TransactionFactory{


    @Override
    public void setProperties(Properties props) {

    }

    @Override
    public Transaction newTransaction(Connection conn) {
        return new MyTransaction(conn);
    }

    @Override
    public Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit) {
        return new MyTransaction(dataSource,level,autoCommit);
    }
}
