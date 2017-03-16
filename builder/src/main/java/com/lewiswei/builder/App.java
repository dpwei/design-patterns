package com.lewiswei.builder;

public class App {

    public static void main(String[] args) {
        Hero thief = new Hero.Builder(Profession.THIEF, "fox")
                .withHairColor(HairColor.BLACK)
                .withHairType(HairType.LONG)
                .withWeapon(Weapon.BOW)
                .build();

        Hero warrior = new Hero.Builder(Profession.WARRIOR, "stone")
                .withHairColor(HairColor.BLACK)
                .withHairType(HairType.SHORT)
                .withWeapon(Weapon.HAMMER)
                .build();


        Hero mage = new Hero.Builder(Profession.MAGE, "sky")
                .withWeapon(Weapon.SWORD)
                .withHairColor(HairColor.GREY)
                .withHairType(HairType.LONG)
                .build();

    }
}
