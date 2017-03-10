package com.lewiswei.adapter;

/**
 * 客户端
 */
public class Captain implements Battleship {

    private Battleship battleship;

    public Captain() {
    }

    public Captain(Battleship battleship) {
        this.battleship = battleship;
    }

    public void setBattleship(Battleship battleship) {
        this.battleship = battleship;
    }

    @Override
    public void fire() {
        battleship.fire();
    }

    @Override
    public void move() {
        battleship.move();
    }
}
