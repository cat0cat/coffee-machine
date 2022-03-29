package org.example.coffee;

public class Espresso extends Recipes {

    public Espresso (int productVolume){
        //30% кофе, 70% воды.
        super.cookCoffee(productVolume,30, 70, 0);
    }
}
