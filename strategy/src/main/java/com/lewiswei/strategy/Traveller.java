package com.lewiswei.strategy;

public class Traveller {

    private TravelStrategy travelStrategy;

    public Traveller(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travelTo(String place) {
        travelStrategy.travelTo(place);
    }
}
