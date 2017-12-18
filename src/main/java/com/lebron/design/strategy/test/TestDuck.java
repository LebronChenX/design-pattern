package com.lebron.design.strategy.test;

import com.lebron.design.strategy.Duck;
import com.lebron.design.strategy.ToyDuck;
import com.lebron.design.strategy.inter.impl.FlyNoWay;
import com.lebron.design.strategy.inter.impl.FlyWithWings;
import com.lebron.design.strategy.inter.impl.Squeak;

public class TestDuck {
    
    public static void main(String[] args) {
        Duck duck = new ToyDuck(new FlyNoWay(), new Squeak());
        duck.display();
        duck.fly();
        duck.quack();
        duck.swim();
        //动态替换飞行行为
        duck.setFlyBehavior(new FlyWithWings());
        duck.fly();
    }
}
