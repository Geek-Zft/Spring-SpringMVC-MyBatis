package com.zft.mybatis.util;
/**
 * Description: 性别枚举
 * @author  fengtan.zhang
 * @date    2019/4/11 0011 下午 5:09
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public enum SexEnum implements EnumValue{
    MALE(1,"男"),
    FEMALE(0,"女");

    private int index;

    private String name;


    SexEnum(int index, String name) {
        this.index = index;
        this.name = name;
    }


    public void setIndex(int index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getName() {
        return name;
    }


    public static SexEnum getSexByIndex(int index) {
        for (SexEnum e : SexEnum.values()) {
            if(e.getIndex() == index) {
                return e;
            }
        }
        return null;
    }


    public static String getNameByIndex(int index) {
        for(SexEnum e : SexEnum.values()) {
            if(e.getIndex() == index) {
                return e.getName();
            }
        }
        return null;
    }
}
