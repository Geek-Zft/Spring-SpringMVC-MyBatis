package com.zft.observable;

import java.util.Observable;
import java.util.Observer;
/**
 * Description: JD观察者
 * @author  fengtan.zhang
 * @date    2019/4/8 0008 上午 9:54
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class JDObserver implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        String newProduct = (String)arg;
        System.out.println("发送新产品【" + newProduct + "】同步到JD商城");
    }
}
