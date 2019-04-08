package com.zft.Factory.simpleFactory;

public class Product2 implements IProduct{

    private String productNo;

    public Product2(String productNo) {
        this.productNo = productNo;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }
}
