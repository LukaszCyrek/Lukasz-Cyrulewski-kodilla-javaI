package com.kodilla.good.patterns.challenges.food2Food;

public class FoodOrderRetriever {

    public FoodOrder retrieve() {

        Supplier glutenFreeShop = new GlutenFreeShop(5);
        FoodOrder glutenFreeShopOrder = new FoodOrder(glutenFreeShop, "rice", 200);
        return glutenFreeShopOrder;

    }
}

