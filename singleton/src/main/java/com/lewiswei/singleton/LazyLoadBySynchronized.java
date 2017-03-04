package com.lewiswei.singleton;

/**
 * Created by Lewis Wei on 17/3/4.
 * <p>
 * 通过 synchronized 关键字实现线程安全和懒加载
 * <p>
 * 由于 getInstance() 被加锁，因此每次访问都会消耗更多资源。
 * <p>
 * 更好的实现是 double check 方式
 */
public class LazyLoadBySynchronized {

    private LazyLoadBySynchronized() {
    }

    private static LazyLoadBySynchronized instance;

    public static synchronized LazyLoadBySynchronized getInstance() {
        if (instance == null) {
            instance = new LazyLoadBySynchronized();
        }
        return instance;
    }
}
