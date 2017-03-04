package com.lewiswei.singleton;

/**
 * 惰性初始化
 * <p>
 * 静态内部类会在 LazyLoadByInnerClass.getInstance() 调用时被初始化。
 * <p>
 * 线程安全。
 */
public class LazyLoadByInnerClass {

    private LazyLoadByInnerClass() {
    }

    public static LazyLoadByInnerClass getInstance() {
        return LazyLoadHelper.INSTANCE;
    }

    private static class LazyLoadHelper {
        private static final LazyLoadByInnerClass INSTANCE = new LazyLoadByInnerClass();
    }

}
