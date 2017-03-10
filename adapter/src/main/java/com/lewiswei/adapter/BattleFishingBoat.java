package com.lewiswei.adapter;

/**
 * 适配器的实现类
 */
public class BattleFishingBoat implements Battleship {

    private FishingBoat fishingBoat;

    public BattleFishingBoat() {
        this.fishingBoat = new FishingBoat();
    }

    @Override
    public void fire() {
        System.out.println("nothing to do...");
    }

    @Override
    public void move() {
        fishingBoat.sail();
    }
}
