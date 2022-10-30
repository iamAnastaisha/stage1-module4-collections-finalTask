package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        for (String key : sourceMap.keySet()) {
            if (resultMap.containsKey(key.length())) {
                Set<String> helper = resultMap.get(key.length());
                helper.add(key);
                resultMap.put(key.length(), helper);
            } else {
                Set<String> set = new HashSet<>();
                set.add(key);
                resultMap.put(key.length(), set);
            }
        }
        return resultMap;
    }
}
