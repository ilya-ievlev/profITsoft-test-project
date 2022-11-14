package com.profitsoft.third_task.impl;

import com.profitsoft.third_task.interfaces.FigureSorting;
import com.profitsoft.third_task.models.Figure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FigureSortingTest {
    FigureSorting figureSorting;

    @BeforeEach
    void init(){
        figureSorting = new FigureSortingImpl();
    }


    @Test
    void throwIllegalArgumentExceptionIfNullPassedToMethod(){
        assertThrows(IllegalArgumentException.class, ()->figureSorting.sortFigureWithStream(null));
    }

    @Test
    void returnEmptyListIfNothingWasAdded(){
        List<Figure> emptyList = new ArrayList<>();
        assertTrue(figureSorting.sortFigureWithStream(emptyList).isEmpty());
    }
}
