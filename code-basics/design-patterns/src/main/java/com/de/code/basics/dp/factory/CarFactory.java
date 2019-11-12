package com.de.code.basics.dp.factory;

public enum CarFactory implements Instance<Car> {
    LUXARY{
        @Override
        public Car newInstance(){
            return new LuxaryCar();
        }
    },BASIC{
        @Override
        public Car newInstance(){
            return new BasicCar();
        }
    }
}
