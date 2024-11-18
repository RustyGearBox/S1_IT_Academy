package org.example;

public class Redactor {

    private String nom;
    private final String dni;
    private static double sou = 1500;

    public Redactor(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public static double getSou() {
        return sou;
    }

    public static void setSou(double sou) {
        Redactor.sou = sou;
    }
}