package io.bootcamp.vimtages.carstate;

import io.bootcamp.vimtages.context.Car;

/**
 * Stopping State
 */
public class Stopping implements CarState {

    @Override
    public void showState() {

        System.out.println("car stopping");

    }


}
