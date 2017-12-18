package com.lebron.design.strategy;

import com.lebron.design.strategy.inter.FlyBehavior;
import com.lebron.design.strategy.inter.QuackBehavior;

public abstract class Duck {

    //通过这两个实例变量（接口），可以将具体实现交给实现类去实现
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
    }

    //构造方法中传入两个静态变量的实现类，用于fly()和quack()方法
    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void swim() {
        System.out.println("swim in the pool");
    }

    //fly()和quack()通过静态变量利用多态完成方法调用
    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    //set方法使得具体类型的Duck可以动态的替换两个实例变量的实现类从而实现不同的行为
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
