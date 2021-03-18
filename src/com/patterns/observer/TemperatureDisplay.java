package com.patterns.observer;

public class TemperatureDisplay implements Observer {
    private float temperature = 0.0f;
    private Observable observable;

    public TemperatureDisplay(Observable o){
       this.observable = o;
       o.addObserver(this);
    }

    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        System.out.println("Temperature Display Updated: " + (this.temperature) );
    }

    public void display(){
        System.out.println("Temperature : " + this.temperature);
    }

    public void removeFromObservable(){
        this.observable.removeObserver(this);
    }
}
