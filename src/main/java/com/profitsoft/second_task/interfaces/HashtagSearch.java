package com.profitsoft.second_task.interfaces;

import java.util.List;
import java.util.Map;

public interface HashtagSearch {
    Map<String, Long> findHashtag(List<String> stringsWithHashtagsList);

}
