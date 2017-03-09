package com.lewiswei.strategy;

public class TrainTravelStrategy implements TravelStrategy {

    @Override
    public void travelTo(String place) {
        System.out.println("travel to " + place + " by train");
    }
}
