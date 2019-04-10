package com.zft.mybatis.mapper;

import com.zft.mybatis.vo.Role;

import java.util.List;

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


}
