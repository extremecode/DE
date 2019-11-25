package com.de.code.basics.dp.observer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MyTopicTest {


    private ByteArrayOutputStream consoleOutput;

    @Before
    public void setUp() throws Exception {
        consoleOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOutput));
    }

    @After
    public void tearDown() throws Exception {
        consoleOutput = null;
    }
    @Test
    public void nortifyObservers() {

        //create subject
        MyTopic topic = new MyTopic();

        //create observers
        Observer obj1 = new MyTopicObserver("Obj1");
        Observer obj2 = new MyTopicObserver("Obj2");
        Observer obj3 = new MyTopicObserver("Obj3");

        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        //attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        //check if any update is available
        obj1.update();

        //now send message to subject
        topic.postMessage("New Message");

        assertEquals("Obj1:: No new message\n" +
                "Message Posted to Topic:New Message\n" +
                "Obj1:: Consuming message::New Message\n" +
                "Obj2:: Consuming message::New Message\n" +
                "Obj3:: Consuming message::New Message\n",consoleOutput.toString().replace("\r",""));
    }
}