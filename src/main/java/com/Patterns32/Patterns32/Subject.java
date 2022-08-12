package com.Patterns32.Patterns32;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void add(Observer observer){
        observers.add(observer);
    }

    public void notifyAgencies() {
        observers.forEach(a -> a.communicate());
    }
}
