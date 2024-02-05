package it.be.epicode.EsercizioUno;

import it.be.epicode.EsercizioUno.Entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeansConfig {

    @Bean
    String getName() {
        return "";
    }

    @Bean
    int getPrezzo() {
        return 0;
    }

    @Bean
    Toppings getToppings() {
        return new Toppings("Bufala",4);
    }

    @Bean
    Pizze getPizze() {
        return new Pizze("Margherita",7);
    }

    @Bean
    Bevande getBevande() {
        return new Bevande("Coca-Cola",2);
    }


    @Bean
    Menu getMenu(Toppings t, Pizze p, Bevande b) {
        return new Menu(p);
    }
    @Bean
    Menu getMenu1(Toppings t) {
return new Menu(t);
    }

    @Bean
    Menu getMenu2(Pizze p) {
        return new Menu(p);
    }

    @Bean
    Menu getMenu3(Bevande b) {
        return new Menu(b);
    }
}
