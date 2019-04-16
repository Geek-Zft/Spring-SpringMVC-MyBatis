package com.zft.mybatis.vo;
/**
 * Description: 女雇员
 * @author  fengtan.zhang
 * @date    2019/4/16 0016 下午 1:46
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class FemaleEmployee extends Employee {

    private FemaleHealthForm femaleHealthForm = null;

    public FemaleHealthForm getFemaleHealthForm() {
        return femaleHealthForm;
    }

    public void setFemaleHealthForm(FemaleHealthForm femaleHealthForm) {
        this.femaleHealthForm = femaleHealthForm;
    }
}
