package com.zft.mybatis.vo;
/**
 * Description: 分页vo
 * @author  fengtan.zhang
 * @date    2019/4/16 0016 上午 9:07
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class PageParams {


    private int start;

    private int limit;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
