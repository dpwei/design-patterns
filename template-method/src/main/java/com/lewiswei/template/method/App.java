package com.lewiswei.template.method;

public class App {

    public static void main(String[] args) {
        Soldier soldier = new Soldier(new Revolver());
        soldier.weaponFighting();

        soldier.changeWeapon(new M4());
        soldier.weaponFighting();
    }
}

