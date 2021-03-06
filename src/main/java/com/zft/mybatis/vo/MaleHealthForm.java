package com.zft.mybatis.vo;

import org.apache.ibatis.type.Alias;

/**
 * Description: 男性体检表
 * @author  fengtan.zhang
 * @date    2019/4/16 0016 下午 1:35
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
@Alias("maleHealthForm")
public class MaleHealthForm extends HealthForm {

    private String prostate;

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }
}
