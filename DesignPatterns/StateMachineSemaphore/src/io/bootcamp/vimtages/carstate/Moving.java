package io.bootcamp.vimtages.carstate;

import io.bootcamp.vimtages.context.Car;
/**
 * Moving State
 */
public class Moving implements CarState {
    @Override
    public void showState() {

        System.out.println("car moving");

    }


}
