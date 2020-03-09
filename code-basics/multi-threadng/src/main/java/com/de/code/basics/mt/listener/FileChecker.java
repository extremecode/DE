package com.de.code.basics.mt.listener;

import java.io.File;

public class FileChecker {
    private long timeStamp;
    private File file;

    public FileChecker init(File file){
        this.file = file;
        this.timeStamp = this.file.lastModified();
        return this;
    }

    public boolean isChanged() {

        if( this.timeStamp != file.lastModified() ) {
            this.timeStamp = file.lastModified();
            //Yes, file is updated
            return true;
        }
        //No, file is not updated
        return false;
    }
}
