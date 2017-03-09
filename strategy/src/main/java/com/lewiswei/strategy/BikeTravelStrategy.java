package com.lewiswei.strategy;

public class BikeTravelStrategy implements TravelStrategy {

    @Override
    public void travelTo(String place) {
        System.out.println("travel to " + place + " by bike");
    }
}
