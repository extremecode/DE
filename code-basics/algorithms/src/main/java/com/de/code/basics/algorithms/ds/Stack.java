package com.de.code.basics.algorithms.ds;

import java.util.LinkedList;

public class Stack<T> {
    LinkedList<T> stack;

    public Stack() {
        this.stack =  new LinkedList<>();
    }

    public void push(T obj){
        this.stack.add(obj);
    }

    public T pull(){
        T obj = this.stack.get(this.stack.size() -1);
        this.stack.remove(this.stack.size()-1);
        return obj;
    }

}
