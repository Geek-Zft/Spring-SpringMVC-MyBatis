package com.zft.observable;
/**
 * Description: 测试观察者模式
 * @author  fengtan.zhang
 * @date    2019/4/8 0008 上午 9:57
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class TestObserver {

    public static void main(String[] args) {
        ProductList observable = ProductList.getInstance();

        JDObserver jdObserver = new JDObserver();
        TBObserver tbObserver = new TBObserver();
        //对被观察者注册观察者，让观察者监控到被观察者的变化
        observable.addObserver(jdObserver);
        observable.addObserver(tbObserver);
        observable.addProduct("新产品1");
    }
}
