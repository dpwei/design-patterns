package com.lewiswei.builder;

public enum Weapon {
    SWORD,
    HAMMER,
    BOW;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
