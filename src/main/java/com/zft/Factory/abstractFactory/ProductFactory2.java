package com.zft.Factory.abstractFactory;

import com.zft.Factory.simpleFactory.IProduct;
import com.zft.Factory.simpleFactory.Product2;
/**
 * Description: 具体工厂2
 * @author  fengtan.zhang
 * @date    2019/4/8 0008 下午 2:46
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class ProductFactory2 implements IProductFactory{
    @Override
    public IProduct createProduct(String productNo) {
        return new Product2(productNo);
    }
}
