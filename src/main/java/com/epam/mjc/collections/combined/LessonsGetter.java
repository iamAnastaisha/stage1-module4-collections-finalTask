package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> resultSet = new HashSet<>();
        for (String str : timetable.keySet()) {
            resultSet.addAll(timetable.get(str));
        }
        return resultSet;
    }
}
