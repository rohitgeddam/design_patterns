package com.patterns.observer;

public class WeatherORamen {
    public static void main(String[] args){
        WeatherStation ws1 = new WeatherStation(55.5f, 25.5f, 102.2f);
        TemperatureDisplay t1 = new TemperatureDisplay(ws1);
        t1.display();
        ws1.updateParameters(20.1f, 22.3f,50.5f);
        t1.display();
        t1.removeFromObservable();
        ws1.updateParameters(30.1f, 52.3f,58.5f);
    }
}
