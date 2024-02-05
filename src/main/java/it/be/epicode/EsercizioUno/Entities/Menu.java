package it.be.epicode.EsercizioUno.Entities;

import java.util.List;

public class Menu {
private List<Toppings> toppings;

private List<Pizza> pizzas;

private List<Drink> drinks;

    public Menu(List<Toppings> toppings, List<Pizza> pizzas, List<Drink> drinks) {
        this.toppings = toppings;
        this.pizzas = pizzas;
        this.drinks = drinks;
    }

    public void stampaMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzas.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppings.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.drinks.forEach(System.out::println);
        System.out.println();

    }
}
