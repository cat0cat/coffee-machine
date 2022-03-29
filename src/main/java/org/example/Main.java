package org.example;

import org.example.containers.CoffeeContainer;
import org.example.containers.MilkContainer;
import org.example.containers.WaterContainer;

public class Main {

    private static int coffeeVol = 0;    //Объем резервуара для кофе (мл)
    private static int waterVol = 0;     //Объем резервуара для воды (мл)
    private static int milkVol = 0;      //Объем резервуара для молока (мл)

    public static void main(String[] args) {
        if (args.length > 0)
            coffeeVol = Integer.parseInt(args[0]);
        if (args.length > 1)
            waterVol = Integer.parseInt(args[1]);
        if (args.length > 2)
            milkVol = Integer.parseInt(args[2]);

        CoffeeMachine machine = new Machine9000(
                new CoffeeContainer(coffeeVol),
                new WaterContainer(waterVol),
                new MilkContainer(milkVol));

        machine.makeCoffee();
    }

}

