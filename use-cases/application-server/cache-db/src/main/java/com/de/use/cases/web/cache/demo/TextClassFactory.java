package com.de.use.cases.web.cache.demo;

public class TextClassFactory {

    public TextClass getTextClass() {
        return new TextClass(new SpecializedTextService());
    }
}
