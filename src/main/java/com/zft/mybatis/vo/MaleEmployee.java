package com.zft.mybatis.vo;

import org.apache.ibatis.type.Alias;

/**
 * Description: 男雇员
 * @author  fengtan.zhang
 * @date    2019/4/16 0016 下午 1:45
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
@Alias("maleEmployee")
public class MaleEmployee extends Employee {

    private MaleHealthForm maleHealthForm = null;

    public MaleHealthForm getMaleHealthForm() {
        return maleHealthForm;
    }

    public void setMaleHealthForm(MaleHealthForm maleHealthForm) {
        this.maleHealthForm = maleHealthForm;
    }
}
