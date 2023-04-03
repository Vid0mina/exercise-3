package ru.mtsb.lesson.three.shape;

public abstract class Shape {

    private final Double mass;

    public Shape(Double mass) {
        this.mass = mass;
    }

    public Double getDensity() {
        return mass / getVolume();
    }

    abstract Double getVolume();

}