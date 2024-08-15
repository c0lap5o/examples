package io.bootcamp.vimtages.context;


import io.bootcamp.vimtages.carstate.CarState;
import io.bootcamp.vimtages.carstate.Stop;

public class Car {
    private CarState state;
    public Car() {

        this.state = new Stop();
    }

    public void setState(CarState state) {
        this.state = state;
    }


    public void move() {
        state.showState();
    }



}
