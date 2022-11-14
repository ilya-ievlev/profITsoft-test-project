package com.profitsoft.third_task.models;

public class Sphere extends Figure implements Comparable<Figure> {

    public Sphere(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException(FIGURE_PARAMETERS_MUST_BE_BIGGER_THAN_ZERO_EXCEPTION);
        } else {
            volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;
        }
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "volume=" + volume +
                '}';
    }
}
