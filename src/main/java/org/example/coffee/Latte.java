package org.example.coffee;

public class Latte extends Recipes {

    public Latte(int productVolume){
        //10% кофе, 30% воды, 60% молока.
        super.cookCoffee(productVolume,10,30,60);
    }

}
