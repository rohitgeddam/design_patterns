package com.patterns.strategypattern.example1;

public class FlyRocketPowered implements FlyBehavior{
    public void fly(){
        System.out.println("I'm Flying with a rocket!");
    }
}
