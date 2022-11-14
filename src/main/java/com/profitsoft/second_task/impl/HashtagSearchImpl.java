package com.profitsoft.second_task.impl;

import com.profitsoft.second_task.interfaces.HashtagSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class HashtagSearchImpl implements HashtagSearch {
    private static final String YOU_CANT_PASS_NULL_TO_THIS_METHOD_EXCEPTION = "you cant pass null to this method";
    private static final String hashtagRegex = "#\\S+";
    private static final Pattern hashtagPattern = Pattern.compile(hashtagRegex);
    private final List<String> allCaughtHashtags = new ArrayList<>();

    @Override
    public Map<String, Long> findHashtag(List<String> stringsWithHashtagsList) {
        if (stringsWithHashtagsList == null) {
            throw new IllegalArgumentException(YOU_CANT_PASS_NULL_TO_THIS_METHOD_EXCEPTION);
        }
        for (String str : stringsWithHashtagsList) {
            if (str == null) {
                continue;
            }
            List<String> localCaughtHashtags = new ArrayList<>();
            Matcher matcher = hashtagPattern.matcher(str);
            while (matcher.find()) {
                String hashtag = matcher.group();
                if (localCaughtHashtags.contains(hashtag)) {
                    continue;
                }
                localCaughtHashtags.add(hashtag);
            }
            allCaughtHashtags.addAll(localCaughtHashtags);
        }
        return allCaughtHashtags.stream().collect(groupingBy(Function.identity(), counting()));
    }
}
