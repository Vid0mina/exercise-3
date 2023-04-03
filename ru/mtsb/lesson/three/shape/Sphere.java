package ru.mtsb.lesson.three.shape;

public class Sphere extends Shape {

    private final Double radius;

    public Sphere(Double mass, Double radius) {
        super(mass);
        this.radius = radius;
    }

    @Override
    Double getVolume() {
        return (4 / 3 * Math.PI * Math.pow(radius, 3));
    }

}
