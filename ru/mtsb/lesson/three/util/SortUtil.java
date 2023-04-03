package ru.mtsb.lesson.three.util;

import ru.mtsb.lesson.three.shape.Sphere;

import java.util.ArrayList;

public class SortUtil {

    public static void bubbleSorting(ArrayList<Sphere> spheres) {
        boolean isChange = false;
        Sphere buffer;
        while (!isChange) {
            isChange = true;
            for (int i = 0; i < spheres.size() - 1; i++) {
                if (spheres.get(i).getDensity() < spheres.get(i + 1).getDensity()) {
                    isChange = false;
                    buffer = spheres.get(i);
                    spheres.set(i, spheres.get(i + 1));
                    spheres.set(i + 1, buffer);
                }
            }
        }
        System.out.println("Результат сортировки: ");
        for (Sphere sphere : spheres) {
            System.out.print(sphere.getDensity() + "; ");
        }
        System.out.println("\nСфера с большей плотностью: " + spheres.get(0).getDensity());
    }

}