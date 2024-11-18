package org.example;

public class NoticiaTenis extends Noticia{

    private String competicio;
    private String tenistes;

    public NoticiaTenis(String titular, String competicio, String tenistes) {
        this.titular = titular;
        this.competicio = competicio;
        this.tenistes = tenistes;
    }

    @Override
    public void preuNoticia() {
        double preuInicial = 150;
        double preuCompeticio = competicio.equals("Wimbledon") ? 100 : 0;
        double preuTenistes = (tenistes.equals("Federer") || tenistes.equals("Nadal") || tenistes.equals("Djokovic")) ? 100 : 0;

        this.preu = preuInicial + preuTenistes;
        System.out.println("El preu de la noticia es: " + this.preu);
    }

    @Override
    public void puntsNoticia(){
        double puntsInicial = 4;
        //double puntsCompeticio = competicio.equals("Wimbledon") ? 3 : 0;
        double puntsTenistes = (tenistes.equals("Ferran Torres") || tenistes.equals("Benzema")) ? 3 : 0;

        this.puntuacio = puntsInicial + puntsTenistes;
        System.out.println("Els punts de la noticia son: " + this.puntuacio);
    }

    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getTenistes() {
        return tenistes;
    }

    public void setTenistes(String tenistes) {
        this.tenistes = tenistes;
    }
}
