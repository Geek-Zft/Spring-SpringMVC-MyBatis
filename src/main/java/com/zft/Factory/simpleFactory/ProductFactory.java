package com.zft.Factory.simpleFactory;
/**
 * Description: 工厂模式
 * @author  fengtan.zhang
 * @date    2019/4/8 0008 上午 10:31
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class ProductFactory implements IProduct{

    /**
     * 只需指定产品编号，调用该方法，就可以得到对应的产品
     * @param productNo
     * @return
     */
    public static IProduct createProduct(String productNo) {

        switch (productNo) {
            case "1" :
                return new Product1(productNo);
            case "2" :
                return new Product2(productNo);
        }
        return null;
    }
}
