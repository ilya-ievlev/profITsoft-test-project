package com.profitsoft.launchers.impl;

import com.profitsoft.launchers.interfaces.Launcher;
import com.profitsoft.second_task.interfaces.HashtagSearch;

import java.util.ArrayList;
import java.util.List;

public class HashtagSearchLauncher implements Launcher {
    private final HashtagSearch hashtagSearch;
    private final List<String> stringWithHashtags = new ArrayList<>();

    public HashtagSearchLauncher(HashtagSearch hashtagSearch) {
        this.hashtagSearch = hashtagSearch;
    }

    @Override
    public void runTheAlgorithm() {
        addValuesToCollection();
        System.out.println(hashtagSearch.findHashtag(stringWithHashtags));
    }

    private void addValuesToCollection() {
        stringWithHashtags.add("#ad;lfkj ad;slfkj a ;sdlkfj #hello #hello #hello dfa #helload");
        stringWithHashtags.add(";alkdsf a;dslkfj adsfdk df;a aq;wekr d  ");
        stringWithHashtags.add("#hello #;;aldkjf df;askd #by #by");

        stringWithHashtags.add(null);
    }
}
