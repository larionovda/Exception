package com.epam.exception;

import com.epam.exception.bean.Car;

/**
 * Created by Полина on 03.12.2016.
 */
public class CarManager {

    public Double getCarCostWithDiscount(Car car){
        return car.getCost() * 0.15;
    }
}
