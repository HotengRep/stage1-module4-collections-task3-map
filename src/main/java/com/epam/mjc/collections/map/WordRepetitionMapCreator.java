package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String,Integer> counterString = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(sentence.toLowerCase(Locale.ROOT).replaceAll
                (",","").replaceAll("\\.","")," ");
        while (tokenizer.hasMoreTokens())
        {
               String temp = tokenizer.nextToken();
               int count = counterString.containsKey(temp) ? counterString.get(temp) + 1: 1;
               counterString.put(temp,count);

        }

        return  counterString;
    }
}
