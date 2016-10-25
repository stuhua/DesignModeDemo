package com.stuhua.designmode.observer;

/**
 * Created by llh on 2016/10/25.
 */

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
