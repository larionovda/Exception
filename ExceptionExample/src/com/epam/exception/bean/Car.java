package com.epam.exception.bean;

/**
 * Created by Полина on 03.12.2016.
 */
public class Car {
    public Car(Double cost, Integer wheelDiameter) {
        this.cost = cost;
        this.wheelDiameter = wheelDiameter;
    }

    public Car() {
    }

    private Double cost;
    private Integer wheelDiameter;

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(Integer wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
}
