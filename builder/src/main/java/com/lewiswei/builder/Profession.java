package com.lewiswei.builder;

public enum Profession {
    WARRIOR,
    THIEF,
    MAGE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
