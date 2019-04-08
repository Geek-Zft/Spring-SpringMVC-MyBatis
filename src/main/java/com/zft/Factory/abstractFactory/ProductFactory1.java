package com.zft.Factory.abstractFactory;

import com.zft.Factory.simpleFactory.IProduct;
import com.zft.Factory.simpleFactory.Product1;
/**
 * Description: 具体工厂1
 * @author  fengtan.zhang
 * @date    2019/4/8 0008 下午 2:00
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class ProductFactory1 implements IProductFactory{
    @Override
    public IProduct createProduct(String productNo) {

        return new Product1(productNo);
    }
}
