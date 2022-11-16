package com.profitsoft.second_task.impl;

import com.profitsoft.second_task.interfaces.HashtagSearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @Test
    void returnOnlyOneHashtagFromOneLine() {
        List<String> stringWithMultipleSameHashtags = new ArrayList<>();
        stringWithMultipleSameHashtags.add("#hello #hello #hello");
        Map<String, Long> foundedHashtags = hashtagSearch.findHashtag(stringWithMultipleSameHashtags);
        assertTrue(foundedHashtags.containsValue(1L));
    }

    @Test
    void returnRightAmountOfSameHashtagsFromMultipleLines() {
        List<String> stringsWithHashtags = new ArrayList<>();
        stringsWithHashtags.add("#hello #hello");
        stringsWithHashtags.add("#hello");
        Map<String, Long> foundedHashtags = hashtagSearch.findHashtag(stringsWithHashtags);
        assertTrue(foundedHashtags.containsValue(2L));
    }

    @Test
    void returnRightAnswerIfOneStringIsNull() {
        List<String> stringsWithHashtags = new ArrayList<>();
        stringsWithHashtags.add("#hello #hello");
        stringsWithHashtags.add(null);
        stringsWithHashtags.add("#hello");
        Map<String, Long> foundedHashtags = hashtagSearch.findHashtag(stringsWithHashtags);
        assertTrue(foundedHashtags.containsValue(2L));
    }
}
