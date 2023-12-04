package org.Item1;

public class Fruit {
    private Fruit() {};

    public static Banana createBanana() {
        return new Banana();
    }
}