package com.lewiswei.template.method;

public abstract class Weapon {

    abstract void load();

    abstract void aim();

    abstract void shoot();

    public void fighting() {
        System.out.println("fighting...");
        load();
        aim();
        shoot();
    }
}