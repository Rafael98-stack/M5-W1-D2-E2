package it.be.epicode.EsercizioUno.Entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {

    @Bean(name = "pomodoro")
    public Toppings toppingPomodoro() {
        return new Toppings("Pomodoro", 0, 10);
    }

    @Bean(name = "formaggio")
    public Toppings toppingFormaggio() {
        return new Toppings("Formaggio", 0, 30);
    }

    @Bean(name = "pancetta")
    public Toppings toppingPancetta() {
        return new Toppings("Pancetta", 2, 15);
    }

    @Bean(name = "bufala")
    public Toppings toppingBufala() {
        return new Toppings("Bufala", 4, 40);
    }

    @Bean(name = "basilico")
    public Toppings toppingBasilico() {
        return new Toppings("Basilico", 0, 5);
    }

    @Bean(name = "mozzarella")
    public Toppings toppingMozzarella() {
        return new Toppings("Mozzarella", 0, 15);
    }

    @Bean(name = "Coca-Cola")
    public Drink drinkCocaCola () {
        return new Drink("Coca-Cola",2,40);
    }

    @Bean
    public Pizza pizzaMargherita() {
        List<Toppings> toppings = new ArrayList<>();
        toppings.add(toppingPomodoro());
toppings.add(toppingMozzarella());

return new Pizza("Pizza Margherita",toppings);
    }

    @Bean
    public Menu menu () {
        List<Pizza> pizzaList = new ArrayList<>();
        List<Drink> drinkList = new ArrayList<>();
        List<Toppings> toppingsList = new ArrayList<>();

        pizzaList.add(pizzaMargherita());

        drinkList.add(drinkCocaCola());

        toppingsList.add(toppingFormaggio());
        toppingsList.add(toppingPomodoro());
        toppingsList.add(toppingPancetta());
        toppingsList.add(toppingMozzarella());
        toppingsList.add(toppingBufala());
        toppingsList.add(toppingBasilico());

        return new Menu(toppingsList, pizzaList, drinkList);
    }
}
