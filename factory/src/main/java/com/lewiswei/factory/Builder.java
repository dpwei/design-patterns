package com.lewiswei.factory;

import com.lewiswei.factory.model.Weapon;

import java.util.function.Supplier;

/**
 * 负责将 weaponType 和对应的实例化方法传递给 factory
 */
public interface Builder {

    void add(WeaponType name, Supplier<Weapon> supplier);

}
