package it.be.epicode.EsercizioUno.Entities;

public abstract class Commons {
   protected String name;

   protected int prezzo;

   protected int calorie;

    public Commons() {
    }

    public Commons(String name, int prezzo, int calorie) {
        this.name = name;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }
}
