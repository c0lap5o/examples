package io.bootcamp.vimtages.trafficlightstate;

import io.bootcamp.vimtages.carstate.Moving;
import io.bootcamp.vimtages.context.Car;

import io.bootcamp.vimtages.context.TrafficLight;

public class RedState implements TrafficLightState{
    /**
     * Transitions the traffic light state
     * Transition car state based on traffic light state
     * @param context Traffic Light
     * @param car     Car context
     */
    @Override
    public void switchLight(TrafficLight context, Car car) {
        System.out.println("Switching to Green");
        context.setState(new GreenState());
        car.setState(new Moving());
         System.out.println("car passed");

    }
}
