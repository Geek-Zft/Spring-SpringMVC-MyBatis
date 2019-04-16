package com.zft.mybatis.vo;

import org.apache.ibatis.type.Alias;

/**
 * Description: 任务表
 * @author  fengtan.zhang
 * @date    2019/4/16 0016 下午 1:38
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
@Alias("task")
public class Task {

    private Long id;

    private String title;

    private String context;

    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
