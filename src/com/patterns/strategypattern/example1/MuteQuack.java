package com.patterns.strategypattern.example1;

public class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("<< Silance >>") ;
    }
}
