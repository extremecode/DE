package com.de.code.basics.mt;

import java.io.PrintStream;
import java.util.HashMap;

public class ThreadCapturer extends PrintStream {
    private PrintStream originalStream;
    private HashMap<Thread, PrintStream> loggerStreams = new HashMap<Thread, PrintStream>();

    public ThreadCapturer(PrintStream originalStream) {
        super(originalStream);
        this.originalStream = originalStream;
    }

    public synchronized void logForThread(Thread threadToLogFor, PrintStream streamToLogTo) {
        loggerStreams.put(threadToLogFor, streamToLogTo);
    }
    /** example overridden print method, you need to override all */
    public synchronized void println(String ln) {
        PrintStream logPS = loggerStreams.get(Thread.currentThread());
        if (logPS != null) { logPS.println(ln); }
        originalStream.println(ln);
    }
}
