package org.example.coffee;

public class Ristretto extends Recipes {

    public Ristretto (int productVolume){
        //50% кофе, 50% воды.
        super.cookCoffee(productVolume,50, 50, 0);
    }
}
