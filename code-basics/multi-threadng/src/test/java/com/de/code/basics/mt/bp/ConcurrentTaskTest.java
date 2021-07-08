package com.de.code.basics.mt.bp;

import com.de.code.basics.mt.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class ConcurrentTaskTest extends ConsoleFixture {

    private Thread task;

    @Before
    public void setUp() throws Exception {
        task = new Thread(new ConcurrentTask());
        super.init(task);
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
        task = null;
        super.tearDown();
    }

    @Test
    public void run() {
        task.start();
        assertEquals("",console());
        task.stop();

    }
}
