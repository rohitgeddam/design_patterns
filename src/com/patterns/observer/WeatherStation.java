package com.patterns.observer;

import java.util.ArrayList;

public class WeatherStation implements Observable{

    private float temperature = 0.0f;
    private float pressure = 0.0f;
    private float humidity = 0.0f;

    private ArrayList<Observer> observerList = new ArrayList<Observer>();


    public  WeatherStation(float temperature, float pressure, float humidity){
       this.temperature = temperature;
       this.pressure = pressure;
       this.humidity = humidity;
   }

   public void updateParameters(float temperature, float pressure, float humidity){
       this.temperature = temperature;
       this.pressure = pressure;
       this.humidity = humidity;
       notifyObservers();
   }

    public void notifyObservers(){
      observerList.forEach((o) -> o.update(temperature, pressure, humidity));
    }

    public void addObserver(Observer o){
        observerList.add(o);
    }

    public void removeObserver(Observer o){
        int index = observerList.indexOf(o);
        observerList.remove(index);
    }
}
