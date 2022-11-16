package com.profitsoft.first_second_lectures_task.first_task.impl;

import com.profitsoft.first_second_lectures_task.first_task.interfaces.PositiveNumbers;

import java.util.*;
import java.util.stream.Collectors;

public class PositiveNumbersImpl implements PositiveNumbers {

    private static final String YOU_CANT_PASS_NULL_TO_THIS_METHOD_EXCEPTION = "you cant pass null to this method";

    @Override
    public List<Integer> sortingNumbersWithStream(List<Integer> originalNumbers) {
        if (originalNumbers == null) {
            throw new IllegalArgumentException(YOU_CANT_PASS_NULL_TO_THIS_METHOD_EXCEPTION);
        }
        return originalNumbers.stream().filter(Objects::nonNull).filter(n -> n >= 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
