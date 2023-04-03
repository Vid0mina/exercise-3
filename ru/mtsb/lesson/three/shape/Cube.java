package ru.mtsb.lesson.three.shape;

public class Cube extends Shape {

    private final Double edge;

    public Cube(Double edge, Double mass) {
        super(mass);
        this.edge = edge;
    }

    @Override
    Double getVolume() {
        return Math.pow(edge, 3);
    }

}
