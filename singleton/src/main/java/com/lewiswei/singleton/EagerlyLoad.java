package com.lewiswei.singleton;

/**
 * 在加载 EgaerlyInitialize 类时就初始化了单例对象
 * <p>
 * 线程安全。
 * 不适用于单例类初始化的成本很高，但是又不一定会被使用。
 */
public class EagerlyLoad {

    private EagerlyLoad() {
    }

    private static final EagerlyLoad INSTANCE = new EagerlyLoad();

    public static EagerlyLoad getInstance() {
        return INSTANCE;
    }
}
