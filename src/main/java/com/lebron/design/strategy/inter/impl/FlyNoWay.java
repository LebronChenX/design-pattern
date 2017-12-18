package com.lebron.design.strategy.inter.impl;

import com.lebron.design.strategy.inter.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("can not fly");
    }

}
