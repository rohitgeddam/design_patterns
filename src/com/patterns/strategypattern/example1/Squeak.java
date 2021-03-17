package com.patterns.strategypattern.example1;

public class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("Squeak");
    }
}
