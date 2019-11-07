package com.shop.model;

public class CatFactory {
    private static Cat cat = new Cat();

    private CatFactory() {
    }

    public static Cat getCatInstance() {
        return cat;
    }

//    public static Cat getCatInstance() {
//        return new Cat("Barsik", "The cat");
//    }
}
