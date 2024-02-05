package it.be.epicode.EsercizioUno.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
public class Bevande implements Commons{
    String name;

int prezzo;

    public Bevande(String name, int prezzo) {
        this.name = name;
        this.prezzo = prezzo;
    }

    public Bevande() {
    }

    @Override
    public String getName(){
     return this.name;
    };

    public int getPrezzo(){
     return this.prezzo;
    };
}
