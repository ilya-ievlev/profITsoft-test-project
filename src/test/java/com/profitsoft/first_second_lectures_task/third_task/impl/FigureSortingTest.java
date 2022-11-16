package com.profitsoft.first_second_lectures_task.third_task.impl;

import com.profitsoft.first_second_lectures_task.third_task.impl.FigureSortingImpl;
import com.profitsoft.first_second_lectures_task.third_task.interfaces.FigureSorting;
import com.profitsoft.first_second_lectures_task.third_task.models.Cube;
import com.profitsoft.first_second_lectures_task.third_task.models.Cylinder;
import com.profitsoft.first_second_lectures_task.third_task.models.Figure;
import com.profitsoft.first_second_lectures_task.third_task.models.Sphere;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FigureSortingTest {
    FigureSorting figureSorting;

    @BeforeEach
    void init() {
        figureSorting = new FigureSortingImpl();
    }


    @Test
    void throwIllegalArgumentExceptionIfNullPassedToMethod() {
        assertThrows(IllegalArgumentException.class, () -> figureSorting.sortFigureWithStream(null));
    }

    @Test
    void returnEmptyListIfNothingWasAdded() {
        List<Figure> emptyList = new ArrayList<>();
        assertTrue(figureSorting.sortFigureWithStream(emptyList).isEmpty());
    }

    @Test
    void returnFiguresInRightOrder() {
        List<Figure> figureList = new ArrayList<>();
        Cube cube = new Cube(3, 5, 6);
        Sphere sphere = new Sphere(5);
        Cylinder cylinder = new Cylinder(5, 6);
        List<Figure> expectedList = List.of(cube, cylinder, sphere);
        figureList.add(cylinder);
        figureList.add(cube);
        figureList.add(sphere);
        assertEquals(expectedList, figureSorting.sortFigureWithStream(figureList));
    }

    @Test
    void returnRightOrderIfOneOfFiguresIsNull() {
        List<Figure> figureList = new ArrayList<>();
        Cube cube = new Cube(3, 5, 6);
        Sphere sphere = new Sphere(5);
        Cylinder cylinder = new Cylinder(5, 6);
        List<Figure> expectedList = List.of(cube, cylinder, sphere);
        figureList.add(cylinder);
        figureList.add(cube);
        figureList.add(null);
        figureList.add(sphere);
        assertEquals(expectedList, figureSorting.sortFigureWithStream(figureList));
    }
}
