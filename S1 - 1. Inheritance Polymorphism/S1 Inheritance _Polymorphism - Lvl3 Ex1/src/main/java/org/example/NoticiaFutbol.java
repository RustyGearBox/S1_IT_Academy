package org.example;

public class NoticiaFutbol extends Noticia{

    private String competicio;
    private String club;
    private String jugador;

    public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
        this.titular = titular;
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    @Override
    public void preuNoticia(){
        double preuInicial = 300;
        double preuCompeticio = competicio.equals("Champions") ? 100 : 0;
        double preuClub = (club.equals("Barça") || club.equals("Madrid")) ? 100 : 0;
        double preuJugador = (jugador.equals("Gol de Ferran Torres") || jugador.equals("Gol de Benzema")) ? 50 : 0;

        this.preu = preuInicial + preuCompeticio + preuClub + preuJugador;
        System.out.println("El preu de la noticia es: " + this.preu);
    }

    @Override
    public void puntsNoticia(){
        double puntsInicial = 5;
        double puntsCompeticio = competicio.equals("Champions") ? 3 : 2;
        double puntsClub = (club.equals("Barça") || club.equals("Madrid")) ? 1 : 0;
        double puntsJugador = (jugador.equals("Gol de Ferran Torres") || jugador.equals("Gol de Benzema")) ? 1 : 0;

        this.puntuacio = puntsInicial + puntsCompeticio + puntsClub + puntsJugador;
        System.out.println("Els punts de la noticia son: " + this.puntuacio);
    }

    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
}
