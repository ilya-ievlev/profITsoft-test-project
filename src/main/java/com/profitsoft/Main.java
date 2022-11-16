package com.profitsoft;

import com.profitsoft.first_second_lectures_task.first_task.impl.PositiveNumbersImpl;
import com.profitsoft.first_second_lectures_task.launchers.impl.FigureSortingLauncher;
import com.profitsoft.first_second_lectures_task.launchers.impl.HashtagSearchLauncher;
import com.profitsoft.first_second_lectures_task.launchers.impl.PositiveNumbersLauncher;
import com.profitsoft.first_second_lectures_task.launchers.interfaces.Launcher;
import com.profitsoft.first_second_lectures_task.second_task.impl.HashtagSearchImpl;
import com.profitsoft.first_second_lectures_task.third_task.impl.FigureSortingImpl;

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
