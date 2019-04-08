package com.zft.Factory.abstractFactory;

import com.zft.Factory.simpleFactory.IProduct;
/**
 * Description: 抽象工厂
 * @author  fengtan.zhang
 * @date    2019/4/8 0008 下午 1:58
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public interface IProductFactory {


     IProduct createProduct(String productNo);
}
