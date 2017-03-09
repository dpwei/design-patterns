package com.lewiswei.strategy;

public class App {

    public static void main(String[] args) {
        Traveller traveller = new Traveller(new PlaneTravelStrategy());
        traveller.travelTo("NewYork");

        traveller.setTravelStrategy(new TrainTravelStrategy());
        traveller.travelTo("Houston");

        traveller.setTravelStrategy(new BikeTravelStrategy());
        traveller.travelTo("D.C");

        // java 8 lambda
        traveller = new Traveller(
                (place) -> System.out.println("travel to " + place + " by spaceship")
        );
        traveller.travelTo("Moon");

        traveller.setTravelStrategy(
                (place) -> System.out.println("travel to " + place + " by feet")
        );
        traveller.travelTo("Home");
    }
}
