package com.profitsoft;

import com.profitsoft.first_task.impl.PositiveNumbersImpl;
import com.profitsoft.launchers.impl.FigureSortingLauncher;
import com.profitsoft.launchers.impl.HashtagSearchLauncher;
import com.profitsoft.launchers.impl.PositiveNumbersLauncher;
import com.profitsoft.launchers.interfaces.Launcher;
import com.profitsoft.second_task.impl.HashtagSearchImpl;
import com.profitsoft.third_task.impl.FigureSortingImpl;

public class Main {
    public static void main(String[] args) {
        Launcher positiveNumberLauncher = new PositiveNumbersLauncher(new PositiveNumbersImpl());
        Launcher hashtagSearchLauncher = new HashtagSearchLauncher(new HashtagSearchImpl());
        Launcher figureSortingLauncher = new FigureSortingLauncher(new FigureSortingImpl());

        positiveNumberLauncher.runTheAlgorithm();
        hashtagSearchLauncher.runTheAlgorithm();
        figureSortingLauncher.runTheAlgorithm();
    }
}
