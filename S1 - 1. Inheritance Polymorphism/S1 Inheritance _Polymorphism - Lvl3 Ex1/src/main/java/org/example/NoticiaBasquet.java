package org.example;

public class NoticiaBasquet extends Noticia{

    private String competicio;
    private String club;

    public NoticiaBasquet(String titular, String competicio, String club) {
        this.titular = titular;
        this.competicio = competicio;
        this.club = club;
    }

    @Override
    public void preuNoticia() {
        double preuInicial = 250;
        double preuCompeticio = competicio.equals("EuroLLiga") ? 75 : 0;
        double preuClub = (club.equals("Barça") || club.equals("Madrid")) ? 75 : 0;

        this.preu = preuInicial + preuCompeticio + preuClub;
        System.out.println("El preu de la noticia es: " + this.preu);
    }

    @Override
    public void puntsNoticia(){
       double puntsInicial = 4;
       double puntsCompeticio = competicio.equals("Champions") ? 3 : 2;
       double puntsClub = (club.equals("Barça") || club.equals("Madrid")) ? 1 : 0;

       this.puntuacio = puntsInicial + puntsCompeticio + puntsClub;
       System.out.println("Els punts de la noticia son: " + this.puntuacio);
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }
}
