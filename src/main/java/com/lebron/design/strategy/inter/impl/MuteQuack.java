package com.lebron.design.strategy.inter.impl;

import com.lebron.design.strategy.inter.QuackBehavior;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("can not quack");
    }

}
