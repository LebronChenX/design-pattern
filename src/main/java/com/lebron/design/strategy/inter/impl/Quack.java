package com.lebron.design.strategy.inter.impl;

import com.lebron.design.strategy.inter.QuackBehavior;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("gua gua gua");
    }

}
