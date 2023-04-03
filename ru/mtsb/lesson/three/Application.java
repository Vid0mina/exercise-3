package ru.mtsb.lesson.three;

import ru.mtsb.lesson.three.shape.Sphere;
import ru.mtsb.lesson.three.util.SortUtil;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ArrayList<Sphere> spheres = new ArrayList<>();
        spheres.add(new Sphere(12.0, 3.0));
        spheres.add(new Sphere(8.0, 3.0));
        spheres.add(new Sphere(7.0, 5.0));
        spheres.add(new Sphere(2.0, 13.0));
        spheres.add(new Sphere(22.0, 33.0));
        spheres.add(new Sphere(1.0, 1.0));
        spheres.add(new Sphere(4.0, 9.0));
        spheres.add(new Sphere(9.0, 4.0));
        spheres.add(new Sphere(5.0, 7.0));
        spheres.add(new Sphere(13.0, 2.0));

        SortUtil.bubbleSorting(spheres);
    }

}