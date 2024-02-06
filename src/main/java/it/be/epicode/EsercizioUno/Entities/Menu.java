package it.be.epicode.EsercizioUno.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Menu {
private List<Toppings> toppings;

private List<Pizza> pizzas;

private List<Drink> drinks;


    public Menu() {
    }
    public Menu( List<Pizza> pizzas, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.drinks = drinks;
    }
    public Menu(List<Toppings> toppings, List<Pizza> pizzas, List<Drink> drinks) {
        this.toppings = toppings;
        this.pizzas = pizzas;
        this.drinks = drinks;
    }

//    public void getMenu() {
//        System.out.println("******* Menu *******");
//        System.out.println("PIZZAS");
//        this.pizzas.forEach(System.out::println);
//        System.out.println();
//
//        System.out.println("TOPPINGS");
//        this.toppings.forEach(System.out::println);
//        System.out.println();
//
//        System.out.println("DRINKS");
//        this.drinks.forEach(System.out::println);
//        System.out.println();
//    }
//
//    public void getOrdine() {
//        System.out.println("******* Menu *******");
//        System.out.println("PIZZAS");
//        this.pizzas.forEach(System.out::println);
//        System.out.println();
//
//        System.out.println("DRINKS");
//        this.drinks.forEach(System.out::println);
//        System.out.println();
//    }

}
