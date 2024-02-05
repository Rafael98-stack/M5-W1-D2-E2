package it.be.epicode.EsercizioUno;

import it.be.epicode.EsercizioUno.Entities.Bevande;
import it.be.epicode.EsercizioUno.Entities.Menu;
import it.be.epicode.EsercizioUno.Entities.Pizze;
import it.be.epicode.EsercizioUno.Entities.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioUnoApplication.class);

		System.out.println("RISTORANTE 'PASTICCIO E PASTICCIATO'");
		System.out.println("MENU': ");
		Menu m = (Menu) ctx.getBean("getMenu");
		 m.getMenu();
		Menu m1 = (Menu) ctx.getBean("getMenu1");
		m1.getMenu();
		Menu m2 = (Menu) ctx.getBean("getMenu2");
		m2.getMenu();
		Menu m3 = (Menu) ctx.getBean("getMenu3");
		m3.getMenu();
	}

}
