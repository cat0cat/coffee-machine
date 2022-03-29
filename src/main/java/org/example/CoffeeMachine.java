package org.example;

import org.example.coffee.*;
import org.example.containers.Containers;

import java.util.Scanner;

public abstract class CoffeeMachine {

    private final Containers coffeeContainer;
    private final Containers waterContainer;
    private final Containers milkContainer;

    public CoffeeMachine(Containers coffeeContainer, Containers waterContainer, Containers milkContainer) {
        this.coffeeContainer = coffeeContainer;
        this.waterContainer = waterContainer;
        this.milkContainer = milkContainer;
    }

    public void addCoffee (int vol){
        coffeeContainer.add(vol);
    }

    public void addWater (int vol){
        waterContainer.add(vol);
    }

    public void addMilk (int vol){
        milkContainer.add(vol);
    }

    public void containersMaxVolume (int coffee, int water, int milk) {
        coffeeContainer.setVol(coffee);
        waterContainer.setVol(water);
        milkContainer.setVol(milk);
    }

    public void showContainersVolume(){
        System.out.println(coffeeContainer.getVolume() + " " +
                waterContainer.getVolume() + " " +
                milkContainer.getVolume());
    }

    public void makeCoffee(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите команды для кофемашины или введите 'turn off'");
            String input = scanner.nextLine().toLowerCase();
            if ("turn off".equals(input))
                break;
            String[] parts = input.split(" ");
            String product = parts[0].toLowerCase();                //наименование, преобразуем в нижний регистр
            int productVolume = Integer.parseInt(parts[1]);         //количество продукта

            switch (product) {
                case ("water"):
                    addWater(productVolume);
                    showContainersVolume();
                    break;
                case ("milk"):
                    addMilk(productVolume);
                    showContainersVolume();
                    break;
                case ("coffee"):
                    addCoffee(productVolume);
                    showContainersVolume();
                    break;
                case ("latte"):
                    Recipes latte = new Latte(productVolume);
                    check(latte);
                    showContainersVolume();
                    break;
                case ("ristretto"):
                    Recipes ristretto = new Ristretto(productVolume);
                    check(ristretto);
                    showContainersVolume();
                    break;
                case ("cappuccino"):
                    Recipes cappuccino = new Cappuccino(productVolume);
                    check(cappuccino);
                    showContainersVolume();
                    break;
                case ("lungo"):
                    Recipes lungo = new Lungo(productVolume);
                    check(lungo);
                    showContainersVolume();
                    break;
                case ("espresso"):
                    Recipes espresso = new Espresso(productVolume);
                    check(espresso);
                    showContainersVolume();
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        scanner.close();
    }

    public void check(Recipes coffee){
        if (coffeeContainer.getVolume() < coffee.needCoffee())
            System.out.println("Добавьте coffee. Осталось " + coffeeContainer.getVolume() +
                    " мл. Требуется еще " + coffee.needCoffee() + " мл.");
        if (waterContainer.getVolume() < coffee.needWater())
            System.out.println("Добавьте water. Осталось " + waterContainer.getVolume() +
                    " мл. Требуется еще " + coffee.needWater() + " мл.");
        if (milkContainer.getVolume() < coffee.needMilk())
            System.out.println("Добавьте milk. Осталось " + milkContainer.getVolume() +
                    " мл. Требуется еще " + coffee.needMilk() + " мл.");
        if ((coffeeContainer.getVolume() >= coffee.needCoffee()) &&
                (waterContainer.getVolume() >= coffee.needWater()) &&
                (milkContainer.getVolume() >= coffee.needMilk())) {
            coffeeContainer.use(coffee.needCoffee());
            waterContainer.use(coffee.needWater());
            milkContainer.use(coffee.needMilk());
        }
    }

}
