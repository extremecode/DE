package com.de.code.basics.mt;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleFixture {
    protected ByteArrayOutputStream consoleOutput;

    private Thread thread = null;

    public void init(Thread t) {
        thread = t;
    }

    @Before
    public void setUp() throws Exception {
        consoleOutput = new ByteArrayOutputStream();
        PrintStream streamLog = new PrintStream(consoleOutput);
        ThreadCapturer threadCapturer = new ThreadCapturer(streamLog);
        if(thread!=null)
            threadCapturer.logForThread(thread,streamLog);
        System.setOut(threadCapturer);
    }

    @After
    public void tearDown() throws Exception {
        consoleOutput = null;
    }

    public String console() {
        return this.consoleOutput.toString().replace("\r", "");
    }
}

