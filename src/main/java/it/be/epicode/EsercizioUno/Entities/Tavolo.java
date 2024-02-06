package it.be.epicode.EsercizioUno.Entities;

import java.util.List;
import java.util.Random;

public class Tavolo extends Coperto{
private int sedie;
private List<Persone> persone;
    public Tavolo() {
    }

    public Tavolo(int sedie, List<Persone> persone) {
        super(sedie);
        this.persone = persone;
    }

    public void getNumeroSedie () {
        this.sedie= persone.size();
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "sedie=" + sedie +
                ", persone=" + persone +
                '}';
    }
}
