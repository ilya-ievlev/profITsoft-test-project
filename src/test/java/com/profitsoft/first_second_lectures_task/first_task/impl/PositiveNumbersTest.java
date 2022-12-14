package com.profitsoft.first_second_lectures_task.first_task.impl;

import com.profitsoft.first_second_lectures_task.first_task.interfaces.PositiveNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PositiveNumbersTest {
    PositiveNumbers positiveNumbers;

    @BeforeEach
    void init() {
        positiveNumbers = new PositiveNumbersImpl();
    }

    @Test
    void throwIllegalArgumentExceptionIfNullPassedToMethod() {
        assertThrows(IllegalArgumentException.class, () -> positiveNumbers.sortingNumbersWithStream(null));
    }

    @Test
    void returnEmptyListIfNothingWasAdded() {
        List<Integer> emptyList = new ArrayList<>();
        assertTrue(positiveNumbers.sortingNumbersWithStream(emptyList).isEmpty());
    }

    @Test
    void returnOnlyBiggerThanZero() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-1);
        List<Integer> listAfterFiltering = positiveNumbers.sortingNumbersWithStream(list);
        for (Integer i : listAfterFiltering) {
            if (i < 0) {
                fail();
            }
        }
    }

    @Test
    void returnSortedNumbersInRightOrder() {
        List<Integer> list = new ArrayList<>();
        List<Integer> expectedList = List.of(8, 5, 3, 1);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(8);
        assertEquals(expectedList, positiveNumbers.sortingNumbersWithStream(list));
    }

    @Test
    void returnSortedNumbersIfOneOfIntegersIsNull() {
        List<Integer> list = new ArrayList<>();
        List<Integer> expectedList = List.of(8, 5, 3, 1);
        list.add(5);
        list.add(3);
        list.add(null);
        list.add(1);
        list.add(8);
        assertEquals(expectedList, positiveNumbers.sortingNumbersWithStream(list));
    }
}
