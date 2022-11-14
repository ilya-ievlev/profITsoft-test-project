package com.profitsoft.third_task.models;

public abstract class Figure implements Comparable<Figure> {
    protected double volume;
    protected static final String FIGURE_PARAMETERS_MUST_BE_BIGGER_THAN_ZERO_EXCEPTION = "figure parameters must be bigger than zero";

    public double getVolume(){
        return volume;
    };

    @Override
    public int compareTo(Figure figure) {
        return Double.compare(volume, figure.getVolume());
    }
}
