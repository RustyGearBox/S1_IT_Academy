package org.example;

import java.util.Scanner;

public class GestioCine {
    private Cine cine;

    public GestioCine(Cine cine) {
        this.cine = cine;
    }

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Mostrar totes les butaques reservades.");
        System.out.println("2. Mostrar les butaques reservades per una persona.");
        System.out.println("3. Reservar una butaca.");
        System.out.println("4. Anul·lar la reserva d'una butaca.");
        System.out.println("5. Anul·lar totes les reserves d'una persona.");
        System.out.println("0. Sortir.");
        return scanner.nextInt();
    }

    public void mostrarButaques() {
        for (Butaca butaca : cine.getGestioButaques().getButaques()) {
            System.out.println(butaca);
        }
    }

    public void mostrarButaquesPersona(String persona) {
        for (Butaca butaca : cine.getGestioButaques().getButaques()) {
            if (butaca.getPersona().equalsIgnoreCase(persona)) {
                System.out.println(butaca);
            }
        }
    }

    public void reservarButaca() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introdueix el número de fila: ");
            int fila = scanner.nextInt();
            System.out.print("Introdueix el número de seient: ");
            int seient = scanner.nextInt();
            System.out.print("Introdueix el nom de la persona: ");
            String persona = scanner.next();

            Butaca butaca = new Butaca(fila, seient, persona);
            cine.getGestioButaques().afegirButaca(butaca);
            System.out.println("Butaca reservada amb èxit.");

        } catch (ExcepcioButacaOcupada e) {
            System.out.println(e.getMessage());
        }
    }

    public void anularReserva() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introdueix el número de fila: ");
            int fila = scanner.nextInt();
            System.out.print("Introdueix el número de seient: ");
            int seient = scanner.nextInt();
            cine.getGestioButaques().eliminarButaca(fila, seient);
            System.out.println("Reserva anul·lada amb èxit.");

        } catch (ExcepcioButacaLliure e) {
            System.out.println(e.getMessage());
        }
    }

    public void anularReservaPersona(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdueix el nom de la persona: ");
            String persona = scanner.next();

            for (int i = cine.getGestioButaques().getButaques().size() - 1; i >= 0; i--) {
                Butaca butaca = cine.getGestioButaques().getButaques().get(i);
                if (butaca.getPersona().equalsIgnoreCase(persona)) {
                    cine.getGestioButaques().eliminarButaca(butaca.getFila(), butaca.getSeient());
                }
            }
            System.out.println("Totes les reserves de " + persona + " han estat anul·lades.");

        }catch (ExcepcioButacaLliure e){
            System.out.println(e.getMessage());
        }

    }
}

