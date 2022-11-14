package com.profitsoft.third_task.models;

public class Cylinder extends Figure implements Comparable<Figure> {

    public Cylinder(int radius, int height) {
        if (radius <= 0 || height <= 0) {
            throw new IllegalArgumentException(FIGURE_PARAMETERS_MUST_BE_BIGGER_THAN_ZERO_EXCEPTION);
        } else {
            volume = Math.PI * Math.pow(radius, 2) * height;
        }
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "volume=" + volume +
                '}';
    }
}
