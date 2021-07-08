package com.de.use.cases.web.cache.demo;

public class SpecializedTextService implements TextService {

    @Override
    public String doSomethingWithText(String text) {
        System.out.println(" specialized text service");
        return " specialized text service";
    }

    @Override
    public String doSomethingElseWithText(String text) {
        System.out.println(" specialized text service");
        return " specialized text service";
    }
}
