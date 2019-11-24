package com.de.code.basics.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    private List<Observer> observers;
    private final Object MUTEX = new Object();
    private Boolean changed;
    private String message;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(observer == null) throw new NullPointerException(" Null Observer");
        synchronized (MUTEX){
            if(!this.observers.contains(observer))
                this.observers.add(observer);
        }
    }

    @Override
    public void deRegister(Observer observer) {
        if(observer == null) throw new NullPointerException(" Null Observer");
        synchronized (MUTEX){
            this.observers.remove(observer);
        }
    }

    @Override
    public void nortifyObservers() {
        List<Observer> observersToNortify= null;
        synchronized (MUTEX){
               if(!changed)
                   return;
               observersToNortify = new ArrayList<Observer>(this.observers);
        }
        observersToNortify.forEach(observer -> {
           observer.update();
        });
    }

    @Override
    public Object getUpdate(Observer observer) {
        return null;
    }
}
