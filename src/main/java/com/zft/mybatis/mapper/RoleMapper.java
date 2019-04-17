package com.zft.mybatis.mapper;

import com.zft.mybatis.vo.PageParams;
import com.zft.mybatis.vo.Role;
import com.zft.mybatis.vo.RoleParams;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Description: 映射器接口
 * @author  fengtan.zhang
 * @date    2019/4/8 0008 下午 5:55
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public interface RoleMapper {

    Role getRole(Long id);

    int insertRole(Role role);

    int deleteRole(Long id);

    int updateRole(Long id);

    List<Role> getList(String roleName);

    List<Role> findRoles(String roleName);

    List<Role> findRoles2(String note);

    List<Role> findRolesByMap(Map<String, Object> param);

    List<Role> findRolesByAnnotation(@Param("roleName") String roleName, @Param("note") String note);

    List<Role> findRolesByBean(RoleParams roleParams);

    List<Role> findByMix(@Param("params") RoleParams roleParams, @Param("page") PageParams pageParams);

    List<Role> findByRowBounds(@Param("roleName") String roleName, @Param("note") String note, RowBounds rowBounds);

    Role testIf(@Param("id") Long id);

    int testSet(Role role);

    List<Role> testForeach(@Param("ids") List<Long> ids);


}
