package com.lebron.design.strategy.inter.impl;

import com.lebron.design.strategy.inter.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("fly with wings");
    }

}
