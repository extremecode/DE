package com.de.code.basics.dp.observer;

public interface Subject {
    void register(Observer observer);
    void deRegister(Observer observer);

    void nortifyObservers();

    Object getUpdate(Observer observer);
}
