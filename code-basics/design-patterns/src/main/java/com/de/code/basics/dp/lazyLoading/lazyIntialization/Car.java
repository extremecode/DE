package com.de.code.basics.dp.lazyLoading.lazyIntialization;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Car {
    private static Map<CarType,Car> types = new ConcurrentHashMap<>();

    public Car(CarType type) {
    }

    public static Car getCarByType(CarType type){
        Car car;

        if(!types.containsKey(type)){
            car = new Car(type);
            types.put(type,car);
        }else {
            car = types.get(type);
        }

        return car;
    }

    public static Car getCarByTypeThreaedSafe(CarType type){

        if(!types.containsKey(type)) {
            synchronized (types) {

                types.put(type, new Car(type));
            }
        }

        return types.get(type);
    }

    public static void showAll()
    {
        if (types.size() > 0) {

            System.out.println("Number of instances made = " + types.size());

            types.forEach((k,v)->{
                System.out.println(k.toString());
            });

            System.out.println();
        }
    }

}
