package org.example.coffee;

public interface IRecipe {

    int needCoffee();

    int needWater();

    int needMilk();

    void cookCoffee (int productVolume, int coffeePer, int waterPer, int milkPer);
}
