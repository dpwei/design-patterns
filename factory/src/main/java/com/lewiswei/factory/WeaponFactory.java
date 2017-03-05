package com.lewiswei.factory;

import com.lewiswei.factory.model.Weapon;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Functional Interface
 * <p>
 * 通过 create 方法获取类的实例
 * factory 方法实现一个 WeaponFactory 接口的实例
 */
public interface WeaponFactory {

    Weapon create(WeaponType weaponType);

    /**
     * java 8 style
     * 工厂初始化方法
     *
     * @param consumer
     * @return
     */
    static WeaponFactory factory(Consumer<Builder> consumer) {
        Map<WeaponType, Supplier<Weapon>> map = new HashMap<>();
        consumer.accept(map::put);
        return name -> map.get(name).get();
    }


//    static WeaponFactory factory(Consumer<Builder> consumer) {
//        Map<WeaponType, Supplier<Weapon>> map = new HashMap<>();
//        consumer.accept(new Builder() {
//            @Override
//            public void add(WeaponType name, Supplier<Weapon> supplier) {
//                map.put(name, supplier);
//            }
//        });
//        return new WeaponFactory() {
//            @Override
//            public Weapon create(WeaponType weaponType) {
//                return map.get(weaponType).get();
//            }
//        };
//    }
}
