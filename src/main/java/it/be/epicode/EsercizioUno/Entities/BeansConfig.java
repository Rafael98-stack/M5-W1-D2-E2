package it.be.epicode.EsercizioUno.Entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {
@Bean(name = "toppingPomodoro")
    Toppings toppingsPomodoro() {
    return new Toppings("Pomodoro",0,10);
}
    @Bean(name = "pizzaMargherita")
    Pizza getPizzaMargherita() {
    List<Toppings> toppings = new ArrayList<>();
    toppings.add(toppingsPomodoro());
return new Pizza("PizzaMargherita",toppings);
    }

    @Bean(name = "coca-Cola")
    Drink cocaCola(){
    return new Drink("Coca-Cola",2,30);
    }

    @Bean(name = "menu")
    Menu menu () {
    List<Toppings> toppings = new ArrayList<>();
    List<Pizza> pizzas = new ArrayList<>();
    List<Drink> drinks = new ArrayList<>();

    pizzas.add(getPizzaMargherita());
    toppings.add(toppingsPomodoro());
    drinks.add(cocaCola());

    return new Menu(toppings,pizzas,drinks);
    }
}
