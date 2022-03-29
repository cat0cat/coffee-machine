package org.example;

import org.example.containers.Containers;

public class Machine9000 extends CoffeeMachine {


    public Machine9000(Containers coffeeContainer, Containers waterContainer, Containers milkContainer) {
        super(coffeeContainer, waterContainer, milkContainer);
        super.containersMaxVolume(300,1300,500);
    }
}
