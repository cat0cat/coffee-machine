package org.example.coffee;

public abstract class Recipes implements IRecipe {

    private int coffee;
    private int water;
    private int milk;

    public int needCoffee(){
        return coffee;
    }

    public int needWater(){
        return water;
    }

    public int needMilk(){
        return milk;
    }

    public void cookCoffee (int productVolume, int coffeePer, int waterPer, int milkPer) {
        if (productVolume >= 10) {
            coffee = (int) (productVolume * coffeePer * 1.0 / 100);
            water = (int) (productVolume * waterPer * 1.0 / 100);
            milk = (int) (productVolume * milkPer * 1.0 / 100);
        } else
            System.out.println("Микропорции не готовим!");
    }
}
