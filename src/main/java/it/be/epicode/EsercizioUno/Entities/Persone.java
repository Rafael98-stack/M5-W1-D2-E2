package it.be.epicode.EsercizioUno.Entities;

import org.springframework.stereotype.Component;


public class Persone {
    String Nome;
    String Cognome;

    public Persone() {
    }

    public Persone(String nome, String cognome) {
        Nome = nome;
        Cognome = cognome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    @Override
    public String toString() {
        return "Persone{" +
                "Nome='" + Nome + '\'' +
                ", Cognome='" + Cognome + '\'' +
                '}';
    }
}
