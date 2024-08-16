package io.bootcamp.vimtages.trafficlightstate;

import io.bootcamp.vimtages.context.Car;
import io.bootcamp.vimtages.context.TrafficLight;

/**
 * Transition traffic light state
 */
public interface TrafficLightState {
    void switchLight(TrafficLight trafficLightContext, Car car);


}
