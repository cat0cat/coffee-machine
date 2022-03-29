package org.example.coffee;

public class Cappuccino extends Recipes {

    public Cappuccino (int productVolume){
        //15% кофе, 40% воды, 45% молока.
        super.cookCoffee(productVolume,15, 40, 45);
    }
}
