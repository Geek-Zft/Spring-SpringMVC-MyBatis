package com.zft.mybatis.mapper;

import com.zft.mybatis.vo.WorkCard;

public interface WorkCardMapper {

    WorkCard getWorkCardByEmpId(Long empId);
}
