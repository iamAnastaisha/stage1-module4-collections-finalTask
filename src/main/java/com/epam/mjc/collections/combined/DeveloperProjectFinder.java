package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> resultList = new ArrayList<>();
        for (String key : projects.keySet()) {
            if (projects.get(key).contains(developer)) {
                resultList.add(key);
            }
        }
        resultList.sort((o1, o2) -> {
            if (o1.length() < o2.length()) {
                return 1;
            } else if (o1.length() > o2.length()) {
                return -1;
            } else {
                return -o1.compareTo(o2);
            }
        });
        return resultList;
    }
}
