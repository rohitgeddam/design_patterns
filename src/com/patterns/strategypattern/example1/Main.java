package com.patterns.strategypattern.example1;

public class Main {
    public static void main(String []args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
