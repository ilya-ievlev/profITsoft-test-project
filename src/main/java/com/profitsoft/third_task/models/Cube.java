package com.profitsoft.third_task.models;

public class Cube extends Figure implements Comparable<Figure> {

    public Cube(int width, int height, int depth) {
        if (width <= 0 || height <= 0 || depth <= 0) {
            throw new IllegalArgumentException(FIGURE_PARAMETERS_MUST_BE_BIGGER_THAN_ZERO_EXCEPTION);
        } else {
            volume = width * height * depth;
        }
    }

    @Override
    public String toString() {
        return "Cube{" +
                "volume=" + volume +
                '}';
    }
}
