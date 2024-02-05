package it.be.epicode.EsercizioUno.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
public class Pizze implements Commons{
    String name;

    int prezzo;

    String str;
    public Pizze() {
    }

    public Pizze(String name, int prezzo) {
        this.name = name;
        this.prezzo = prezzo;
    }

    public Pizze(String name, int prezzo, String str) {
        this.name = name;
        this.prezzo = prezzo;
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public int getPrezzo(){
       return   this.prezzo;
    };

    @Override
      public String getName(){
        return this.name;
    };


}
