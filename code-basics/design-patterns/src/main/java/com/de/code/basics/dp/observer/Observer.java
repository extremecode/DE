package com.de.code.basics.dp.observer;

public interface Observer {
    void update();

    void setSubject(Subject subject);
}
