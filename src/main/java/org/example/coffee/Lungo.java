package org.example.coffee;

public class Lungo extends Recipes {

    public Lungo (int productVolume){
        //15% кофе, 85% воды.
        super.cookCoffee(productVolume,15, 85, 0);
    }
}
