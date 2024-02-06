package it.be.epicode.EsercizioUno;

import it.be.epicode.EsercizioUno.Entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;

@SpringBootApplication
public class EsercizioUnoApplication {

	public static void main(String[] args) {

		SpringApplication.run(EsercizioUnoApplication.class, args);
//
//		Bevande bevande = new Bevande("Coca-Cola",2);
//		Pizze pizze = new Pizze("Margherita",7);
//		Toppings toppings = new Toppings("Bufala",4);
//
//		Menu m = new Menu(bevande);
//
//		System.out.println(m);
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioUnoApplication.class);

		System.out.println("RISTORANTE 'PASTICCIO E PASTICCIATO'");
		System.out.println("MENU': ");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioUnoApplication.class);
		Menu m = (Menu) ctx.getBean("menu");

		m.getMenu();
		ctx.close();
	}

}
