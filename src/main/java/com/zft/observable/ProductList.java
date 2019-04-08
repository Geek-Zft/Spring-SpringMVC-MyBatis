package com.zft.observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Description: 被消费者
 *              一对多，此处用到单例模式,但只是一个简单的单例模式，并不是线程安全的单例
 * @author  fengtan.zhang
 * @date    2019/4/8 0008 上午 9:38
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class ProductList extends Observable{ //需要继承java.util.Observable


    private List<String> productList = null; //产品列表

    private static ProductList instance; //类唯一实例

    private ProductList() {}


    public static ProductList getInstance() {
        if(instance == null) {
            instance = new ProductList();
            instance.productList = new ArrayList<>();
        }
        return instance;
    }

    /**
     *  增加观察者
     * @param observer
     */
    public void addProductListObserver(Observer observer) {
        this.addObserver(observer);
    }

    /**
     * 新增产品
     * @param newProduct
     */
    public void addProduct(String newProduct){
        productList.add(newProduct);
        System.out.println("产品列表新增了产品：" + newProduct);
        this.setChanged(); //设置被观察者对象发生变化
        this.notifyObservers(newProduct); //通知观察者，并传递新产品
    }

}
