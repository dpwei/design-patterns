package com.lewiswei.singleton;

/**
 * Created by Lewis Wei on 17/3/4.
 * <p>
 * Effective Java 2nd
 * <p>
 * 线程安全。
 * 比较直接在 getInstance 方法上使用 synchronized 保证线程安全的方案，性能提升25%左右。
 * 参照 Joshua Bloch "Effective Java, Second Edition", p. 283-284
 */
public class LazyLoadByDoubleCheck {

    private LazyLoadByDoubleCheck() {
    }

    private static LazyLoadByDoubleCheck instance;

    public static LazyLoadByDoubleCheck getInstance() {
        LazyLoadByDoubleCheck result = instance;
        if (result == null) {
            // 锁定类对象，创建互斥的执行环境。多线程情况下，有可能已经存在多个线程进入 getInstance 方法
            synchronized (LazyLoadByDoubleCheck.class) {
                //重新赋值【其他线程可能已经将 instance 实例化】
                result = instance;
                // 再次检查
                if (result == null) {
                    instance = new LazyLoadByDoubleCheck();
                }
            }
        }
        return instance;
    }
}
