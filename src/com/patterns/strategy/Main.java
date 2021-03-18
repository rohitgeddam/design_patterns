package com.patterns.strategy;

public class Main {
    public static void main(String []args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
    }
}