package com.lewiswei.template.method;

public class M4 extends Weapon {

    @Override
    void load() {
        System.out.println("M4 load in 7s");
    }

    @Override
    void aim() {
        System.out.println("M4 aim");
    }

    @Override
    void shoot() {
        System.out.println("M4 shoot");
    }
}
