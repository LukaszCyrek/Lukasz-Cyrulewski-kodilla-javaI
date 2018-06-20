package com.kodilla.good.patterns.challenges.firstchallenges;

import java.util.HashMap;
import java.util.Map;

public class ListOfProduct {
    Map<String, Integer> productList = new HashMap<>();

    public Map<String, Integer> createStorage() {
        productList.put("piłka", 15);
        productList.put("rękawice bramkarskie", 10);
        productList.put("korki", 11);
        return productList;
    }
}
