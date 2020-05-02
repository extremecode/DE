package com.de.code.basics.algorithms.ds;

import java.util.LinkedList;

public class Queue<T> {
    LinkedList<T> queue;

    public Queue() {
        this.queue =  new LinkedList<>();
    }

    public void add(T obj){
        this.queue.add(obj);
    }

    public T remove(){
        T obj = this.queue.get(0);
        this.queue.remove(0);
        return obj;
    }

    public T peek(){
        return  this.queue.get(0);
    }


    public boolean isEmpty(){
        return queue.size()==0?true: false;
    }

}
