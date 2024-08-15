package io.bootcamp.vimtages.carstate;

/**
 * Stopped State
 */

public class Stop implements CarState {
    @Override
    public void showState() {
        System.out.println("car stopped, waiting");

    }
}
