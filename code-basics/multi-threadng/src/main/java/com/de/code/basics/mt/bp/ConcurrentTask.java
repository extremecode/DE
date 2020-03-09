package com.de.code.basics.mt.bp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcurrentTask implements Runnable {

    private static List TMEP = Collections.synchronizedList(new ArrayList<>());
    @Override
    public void run() {
        int count=1;
        TMEP.add("Its Working "+count++);
        TMEP.add("Its Working "+count++);
        TMEP.forEach(t->{
            System.out.println(t);
        });

        TMEP.clear();
    }
}
