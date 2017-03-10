package com.lewiswei.adapter;

public class App {

    public static void main(String[] args) {
        Captain captain = new Captain();
        captain.setBattleship(new Cruiser());
        captain.move();
        captain.fire();

        // adapter 模式
        captain.setBattleship(new BattleFishingBoat());
        captain.move();
        captain.fire();
    }
}
