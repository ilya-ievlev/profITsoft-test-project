package com.profitsoft.second_task.impl;

import com.profitsoft.second_task.interfaces.HashtagSearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashtagSearchTest {
    HashtagSearch hashtagSearch;

    @BeforeEach
    void init() {
        hashtagSearch = new HashtagSearchImpl();
    }

    @Test
    void throwIllegalArgumentExceptionIfNullPassedToMethod() {
        assertThrows(IllegalArgumentException.class, () -> hashtagSearch.findHashtag(null));
    }

    @Test
    void returnEmptyListIfNothingWasAdded() {
        List<String> emptyList = new ArrayList<>();
        assertTrue(hashtagSearch.findHashtag(emptyList).isEmpty());
    }
}
