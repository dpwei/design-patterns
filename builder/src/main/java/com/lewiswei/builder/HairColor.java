package com.lewiswei.builder;

public enum HairColor {
    RED,
    BLACK,
    GREY,
    YELLOW;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
