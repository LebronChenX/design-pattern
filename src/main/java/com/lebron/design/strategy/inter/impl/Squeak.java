package com.lebron.design.strategy.inter.impl;

import com.lebron.design.strategy.inter.QuackBehavior;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("zhi zhi zhi");
    }

}
