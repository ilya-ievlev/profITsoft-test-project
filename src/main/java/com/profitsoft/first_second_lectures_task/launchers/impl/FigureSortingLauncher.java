package com.profitsoft.first_second_lectures_task.launchers.impl;

import com.profitsoft.first_second_lectures_task.launchers.interfaces.Launcher;
import com.profitsoft.first_second_lectures_task.third_task.interfaces.FigureSorting;
import com.profitsoft.first_second_lectures_task.third_task.models.Cube;
import com.profitsoft.first_second_lectures_task.third_task.models.Cylinder;
import com.profitsoft.first_second_lectures_task.third_task.models.Figure;
import com.profitsoft.first_second_lectures_task.third_task.models.Sphere;

import java.util.ArrayList;
import java.util.List;

public class FigureSortingLauncher implements Launcher {
    private final FigureSorting figureSorting;
    private final List<Figure> figureList = new ArrayList<>();

    public FigureSortingLauncher(FigureSorting figureSorting) {
        this.figureSorting = figureSorting;
    }

    @Override
    public void runTheAlgorithm() {
        addValuesToCollection();
        figureSorting.sortFigureWithStream(figureList);
        System.out.println(figureList);
    }

    private void addValuesToCollection() {
        figureList.add(new Cube(4, 5, 6));
        figureList.add(new Sphere(4));
        figureList.add(new Cube(4, 5, 6));
        figureList.add(new Cylinder(4, 5));
        figureList.add(new Sphere(56));
    }
}
