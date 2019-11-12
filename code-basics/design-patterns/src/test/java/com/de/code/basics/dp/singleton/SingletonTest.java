package com.de.code.basics.dp.singleton;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void getInstance() {
        assertTrue(Singleton.getInstance() instanceof Singleton);
    }
}