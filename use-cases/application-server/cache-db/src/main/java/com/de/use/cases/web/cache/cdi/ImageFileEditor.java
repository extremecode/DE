package com.de.use.cases.web.cache.cdi;

public interface ImageFileEditor {
    String openFile(String fileName);
    String editFile(String fileName);
    String writeFile(String fileName);
    String saveFile(String fileName);
}
