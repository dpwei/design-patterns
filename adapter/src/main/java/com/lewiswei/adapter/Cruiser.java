package com.lewiswei.adapter;

public class Cruiser implements Battleship {

    @Override
    public void fire() {
        System.out.println("Cruiser fire");
    }

    @Override
    public void move() {
        System.out.println("Cruiser move");
    }
}
