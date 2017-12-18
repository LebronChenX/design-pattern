package com.lebron.design.strategy;

import com.lebron.design.strategy.inter.FlyBehavior;
import com.lebron.design.strategy.inter.QuackBehavior;

public class ToyDuck extends Duck{

    //具体的鸭子，通过父类Duck的构造器将FlyBehavior和QuackBehavior的具体实现类传进去
    public ToyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    //重写Duck类的抽象方法，自己实现该方法
    @Override
    public void display() {
        System.out.println("toy duck is small");
    }

}
