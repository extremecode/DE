package com.de.code.basics.mt.listener;

import java.io.File;

public class FileListener extends Thread {
    private String fname;
    private Object mutexLock = new Object();
    private FileChecker fileChecker;

    public void init(String fname) {
        this.fname = fname;
        this.fileChecker = new FileChecker();
        this.fileChecker.init(new File(this.fname));
    }

    public void run() {
        try {
            while (true) {
                synchronized (mutexLock) {
                    mutexLock.wait(500);
                }
                if(this.fileChecker.isChanged()){
                    System.out.println(" File has changed :"+this.fname);
                    System.out.println(" Reload Configuration :"+this.fname);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
