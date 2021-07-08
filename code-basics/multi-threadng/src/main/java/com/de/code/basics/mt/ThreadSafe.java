package com.de.code.basics.mt;

public class ThreadSafe implements Runnable {
    final Integer taskId;
    final Object mutex;

    public ThreadSafe(Integer taskId) {
        this.taskId = taskId;
        this.mutex = this;
    }

    @Override
    public void run() {
        synchronized (mutex) {
            System.out.println("Task ID : " + this.taskId + " performed by "
                    + Thread.currentThread().getName());
        }
    }
}
