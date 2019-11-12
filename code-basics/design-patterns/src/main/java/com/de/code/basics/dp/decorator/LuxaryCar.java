package com.de.code.basics.dp.decorator;

public class LuxaryCar extends CarDecorator {

    public LuxaryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" adding features of luxary Car ");
    }

}
