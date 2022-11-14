package com.profitsoft.third_task.impl;

import com.profitsoft.third_task.interfaces.FigureSorting;
import com.profitsoft.third_task.models.Figure;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FigureSortingImpl implements FigureSorting {

    private static final String YOU_CANT_PASS_NULL_TO_THIS_METHOD_EXCEPTION = "you cant pass null to this method";

    public List<Figure> sortFigureWithStream(List<Figure> figureList) {
        if (figureList == null) {
            throw new IllegalArgumentException(YOU_CANT_PASS_NULL_TO_THIS_METHOD_EXCEPTION);
        }
        return figureList.stream().filter(Objects::nonNull).sorted().collect(Collectors.toList());
    }
}
