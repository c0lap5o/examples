package io.bootcamp.vimtages.context;

import io.bootcamp.vimtages.trafficlightstate.RedState;
import io.bootcamp.vimtages.trafficlightstate.TrafficLightState;

public class TrafficLight {
        private Car car;
        private TrafficLightState state;

    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * Starting State
     */
    public TrafficLight() {
           this.state = new RedState(); // Initial state
        }

    /**
     *
     * @param state Set new TrafficLightState
     *
     */
        public void setState(TrafficLightState state) {
            this.state = state;

        }

    /**
     * Changes TrafficLight and Car State
     */
    public void switchLight() {
            state.switchLight(this,car);
        }


}
