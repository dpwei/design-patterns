package com.lewiswei.template.method;

public class Soldier {

    private Weapon weapon;

    public Soldier(Weapon weapon) {
        this.weapon = weapon;
    }

    public void weaponFighting() {
        this.weapon.fighting();
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
