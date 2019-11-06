package com.de.code.basics.dp.builder;

public interface Builder<T> {
    void init();
    Builder add(T obj);
    Builder remove(T obj);
    void build();
}
