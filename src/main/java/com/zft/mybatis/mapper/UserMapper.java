package com.zft.mybatis.mapper;

import com.zft.mybatis.vo.User;

/**
 * Description: User Mapper
 * @author  fengtan.zhang
 * @date    2019/4/11 0011 下午 5:20
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public interface UserMapper {


    User getUser(Long id);
}
