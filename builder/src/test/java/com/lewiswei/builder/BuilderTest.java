package com.lewiswei.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuilderTest {

    @Test
    public void buildHero() {
        Profession profession = Profession.WARRIOR;
        String heroName = "jugg";
        Hero hero = new Hero.Builder(profession, heroName).build();
        assertEquals(profession, hero.getProfession());
        assertEquals(heroName, hero.getName());
    }


    @Test(expected = IllegalArgumentException.class)
    public void buildHeroMissingProfession() {
        String heroName = "jugg";
        new Hero.Builder(null, heroName).build();
    }


    @Test(expected = IllegalArgumentException.class)
    public void buildHeroMissingName() {
        Profession profession = Profession.MAGE;
        new Hero.Builder(profession, "").build();
    }

    @Test
    public void buildHeroWithAllProps() {
        String heroName = "Maye";
        Hero hero = new Hero.Builder(Profession.THIEF, heroName)
                .withWeapon(Weapon.SWORD)
                .withHairType(HairType.SHORT)
                .withHairColor(HairColor.RED)
                .build();

        assertEquals(Profession.THIEF, hero.getProfession());
        assertEquals(heroName, hero.getName());
        assertEquals(Weapon.SWORD, hero.getWeapon());
        assertEquals(HairType.SHORT, hero.getHairType());
        assertEquals(HairColor.RED, hero.getHairColor());
    }
}
