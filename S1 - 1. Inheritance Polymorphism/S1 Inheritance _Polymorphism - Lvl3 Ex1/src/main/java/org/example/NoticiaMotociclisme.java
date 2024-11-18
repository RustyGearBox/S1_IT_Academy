package org.example;

public class NoticiaMotociclisme extends Noticia{

    private String club;

    public NoticiaMotociclisme(String titular,String club) {
        this.titular = titular;
        this.club = club;
    }

    @Override
    public void preuNoticia() {
        double preuInicial = 100;
        double preuClub = (club.equals("Honda") || club.equals("Yamaha")) ? 50 : 0;

        this.preu = preuInicial + preuClub;
        System.out.println("El preu de la noticia es: " + this.preu);
    }

    @Override
    public void puntsNoticia(){
        double puntsInicial = 3;
        double puntsClub = (club.equals("Honda") || club.equals("Yamaha")) ? 3 : 0;

        this.puntuacio = puntsInicial + puntsClub;
        System.out.println("Els punts de la noticia son: " + this.puntuacio);
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
