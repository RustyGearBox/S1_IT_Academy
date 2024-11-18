package org.example;

import java.util.Scanner;

public class Cine {
    private int files;
    private int seientsPerFila;
    private GestioButaques gestioButaques;
    private GestioCine gestioCine;

    public Cine() {
        gestioButaques = new GestioButaques();
        gestioCine = new GestioCine(this);
        demanarDadesInicials();
    }

    public GestioButaques getGestioButaques() {
        return gestioButaques;
    }

    private void demanarDadesInicials() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el nombre de files: ");
        this.files = scanner.nextInt();
        System.out.print("Introdueix el nombre de seients per fila: ");
        this.seientsPerFila = scanner.nextInt();
    }

    public void iniciar() {
        int opcio;
        do {
            opcio = gestioCine.menu();
            switch (opcio) {
                case 1:
                    gestioCine.mostrarButaques();
                    break;
                case 2:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Introdueix el nom de la persona: ");
                    String persona = scanner.next();
                    gestioCine.mostrarButaquesPersona(persona);
                    break;
                case 3:
                    gestioCine.reservarButaca();
                    break;
                case 4:
                    gestioCine.anularReserva();
                    break;
                case 5:
                    gestioCine.anularReservaPersona();
                    break;
                case 0:
                    System.out.println("Sortint de l'aplicació...");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna a provar.");
            }
        } while (opcio != 0);
    }
}

