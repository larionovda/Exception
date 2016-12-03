package com.epam.exception;

import com.epam.exception.bean.Car;

/**
 * Created by Полина on 03.12.2016.
 */
public class Main {

    public static void main(String[] args) {
        CarManager carManager = new CarManager();
        Car car = new Car(6000000d, 21);

        Double carCost = carManager.getCarCostWithDiscount(car);
        System.out.printf("%.2f", carCost);
    }
}
