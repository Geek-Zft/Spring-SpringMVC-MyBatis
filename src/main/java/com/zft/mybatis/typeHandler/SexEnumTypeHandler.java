package com.zft.mybatis.typeHandler;

import com.zft.mybatis.util.SexEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * Description: SexEnum类型转换器
 * @author  fengtan.zhang
 * @date    2019/4/11 0011 下午 7:34
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
@MappedTypes(SexEnum.class)
@MappedJdbcTypes(JdbcType.INTEGER)
public class SexEnumTypeHandler implements TypeHandler<SexEnum>{
    @Override
    public void setParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i,parameter.getIndex());
    }

    @Override
    public SexEnum getResult(ResultSet rs, String columnName) throws SQLException {
        int index = rs.getInt(columnName);
        return SexEnum.getSexByIndex(index);
    }

    @Override
    public SexEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
        int index = rs.getInt(columnIndex);
        return SexEnum.getSexByIndex(index);
    }

    @Override
    public SexEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
        int index = cs.getInt(columnIndex);
        return SexEnum.getSexByIndex(index);
    }
}
