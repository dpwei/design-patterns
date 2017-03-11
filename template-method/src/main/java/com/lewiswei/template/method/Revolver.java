package com.lewiswei.template.method;

public class Revolver extends Weapon {

    @Override
    public void load() {
        System.out.println("Revolver load in 4s");
    }

    @Override
    void aim() {
        System.out.println("Revolver aim");
    }

    @Override
    public void shoot() {
        System.out.println("Revolver shoot");
    }
}
