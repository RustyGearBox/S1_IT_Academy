package org.example;

public class NoticiaF1 extends Noticia{

    private String escuderia;

    public NoticiaF1(String titular, String escuderia) {
        this.titular = titular;
        this.escuderia = escuderia;
    }

    @Override
    public void preuNoticia() {
        double preuInicial = 100;
        double preuEscuderia = (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) ? 50 : 0;

        this.preu = preuInicial + preuEscuderia;
        System.out.println("El preu de la noticia es: " + this.preu);
    }

    @Override
    public void puntsNoticia(){
        double puntsInicial = 4;
        double puntsEscuderia = (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) ? 2 : 0;

        this.puntuacio = puntsInicial + puntsEscuderia;
        System.out.println("Els punts de la noticia son: " + this.puntuacio);
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }
}
