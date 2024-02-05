package it.be.epicode.EsercizioUno.Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Menu {
    private Commons commons;

    public Menu() {
    }

    public Menu (Commons commons) {
        this.commons = commons;
    }

    public void getMenu() {
        System.out.println(this.commons.getName() + " " + this.commons.getPrezzo() + "$");
    }
}
