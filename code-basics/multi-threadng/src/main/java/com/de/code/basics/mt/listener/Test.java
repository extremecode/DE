package com.de.code.basics.mt.listener;

public class Test {

    private static FileListener FILE_LISTENER;
    public static void main(String[] args) {
        FILE_LISTENER = new FileListener();
        FILE_LISTENER.init("C:/Users/guptakas/Documents/debug/changes.txt");
        FILE_LISTENER.start();
    }
}
