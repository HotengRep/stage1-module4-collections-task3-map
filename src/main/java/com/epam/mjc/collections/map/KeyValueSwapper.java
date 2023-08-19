package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> swapMap = new LinkedHashMap<>();
        SortedMap<Integer,String> sortedMap = new TreeMap<>(sourceMap);
        for(Map.Entry<Integer,String> entry: sortedMap.entrySet())
        {
            swapMap.putIfAbsent(entry.getValue(),entry.getKey());
        }

        return  swapMap;
    }
}
