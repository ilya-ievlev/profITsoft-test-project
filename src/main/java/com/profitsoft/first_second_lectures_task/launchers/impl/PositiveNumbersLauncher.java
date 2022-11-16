package com.profitsoft.first_second_lectures_task.launchers.impl;

import com.profitsoft.first_second_lectures_task.launchers.interfaces.Launcher;
import com.profitsoft.first_second_lectures_task.first_task.interfaces.PositiveNumbers;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumbersLauncher implements Launcher {
    private final PositiveNumbers positiveNumbers;
    private final List<Integer> numbersList = new ArrayList<>();

    public PositiveNumbersLauncher(PositiveNumbers positiveNumbers) {
        this.positiveNumbers = positiveNumbers;
    }

    @Override
    public void runTheAlgorithm() {
        addValuesToCollection();
        System.out.println(positiveNumbers.sortingNumbersWithStream(numbersList));
    }

    private void addValuesToCollection() {
        numbersList.add(5);
        numbersList.add(45645321);
        numbersList.add(0);
        numbersList.add(0);
        numbersList.add(-123123);
        numbersList.add(-1);
        numbersList.add(12312);
        numbersList.add(4);
    }
}
