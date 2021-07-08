package com.de.use.cases.web.cache.cdi;

import javax.inject.Inject;

public class ImageFileProcessor {

    private ImageFileEditor imageFileEditor;

    @Inject
    public ImageFileProcessor(ImageFileEditor imageFileEditor) {
        this.imageFileEditor = imageFileEditor;
    }

    public String openFile(String s) {
        return imageFileEditor.openFile(s);
    }
}
