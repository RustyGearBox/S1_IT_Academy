package org.example;

import java.util.*;

public class Main {

    private static Map<String, Redactor> redactors = new HashMap<>();
    private static Map<String, List<Noticia>> noticiesPerRedactor = new HashMap<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sortir = true ;
        while (sortir){
            mostrarMenu();
            int opcio = llegirOpcio();

            switch (opcio){
                case 1:
                    introduirRedactor();
                    break;
                case 2:
                    eliminarRedactor();
                    break;
                case 3:
                    introduirNoticia();
                    break;
                case 4:
                    eliminarNoticia();
                    break;
                case 5:
                    mostrarNoticiesPerRedactor();
                    break;
                case 6:
                    calcularPuntuacioNoticia();
                    break;
                case 7:
                    calcularPreuNoticia();
                    break;
                case 0:
                    sortir = false;
                    System.out.println("Sortint...");
                    break;
                default:
                    System.out.println("Opcio no valida");
            }
        }

    }

    private static void mostrarMenu(){
        System.out.println("1.- Introduir redactor");
        System.out.println("2.- Eliminar redactor");
        System.out.println("3.- Introduir notícia a un redactor");
        System.out.println("4.- Eliminar notícia");
        System.out.println("5.- Mostrar totes les notícies per redactor");
        System.out.println("6.- Calcular puntuació de la notícia");
        System.out.println("7.- Calcular preu-notícia");
        System.out.println("0.- Sortir");
    }

    private static int llegirOpcio(){
        while (!scanner.hasNextInt()){
            System.out.println("Introdueix un numero valid:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void introduirRedactor(){
        System.out.print("Introdueix el nom del redactor: ");
        String nom = scanner.next();
        System.out.print("Introdueix el dni del redactor: ");
        String dni = scanner.next();

        if(redactors.containsKey(dni)){
            System.out.println("El redactor ja esta registrat.");
        }else{
            Redactor redactor = new Redactor(nom, dni);
            redactors.put(dni,redactor);
            noticiesPerRedactor.put(dni, new ArrayList<>());
            System.out.println("Redactor afegit.");
        }
    }

    private static void eliminarRedactor(){
        System.out.print("Introdueix el nom del redactor: ");
        String dni = scanner.next();

        if(redactors.containsKey(dni)){
            redactors.remove(dni);
            noticiesPerRedactor.remove(dni);
            System.out.println("Redactor eliminat.");
        }else{
            System.out.println("Redactor no trobat.");
        }
    }

    private static void introduirNoticia(){
        System.out.print("Introdueix el nom del redactor: ");
        String dni = scanner.next();

        if(!redactors.containsKey(dni)){
            System.out.println("Redactor no trobat.");
            return;
        }

        System.out.print("Introdueix el titular de la noticia:");
        String titular = scanner.next();
        System.out.println("Introdueix el tipus de noticia:");
        String tipus = scanner.next().toLowerCase();

        Noticia noticia = null;

        switch (tipus){
            case "futbol":
                System.out.print("Competicio: ");
                String competicioFutbol = scanner.next();
                System.out.print("Club: ");
                String clubFutbol = scanner.next();
                System.out.print("Jugador: ");
                String jugadorFutbol = scanner.next();

                noticia = new NoticiaFutbol(titular,competicioFutbol,clubFutbol,jugadorFutbol);
                break;

            case "basquet":
                System.out.print("Competicio: ");
                String competicioBasquet = scanner.next();
                System.out.print("Club: ");
                String clubBasquet = scanner.next();

                noticia = new NoticiaBasquet(titular, competicioBasquet, clubBasquet);
                break;

            case "tenis":
                System.out.print("Competicio: ");
                String competicioTenis = scanner.next();
                System.out.print("Jugador: ");
                String tenistesTenis = scanner.next();

                noticia = new NoticiaTenis(titular, competicioTenis, tenistesTenis);
                break;

            case "f1":
                System.out.print("Escuderia: ");
                String escuderiaF1 = scanner.next();

                noticia = new NoticiaF1(titular, escuderiaF1);
                break;

            case "motociclisme":
                System.out.print("Club: ");
                String clubMotociclisme = scanner.next();

                noticia = new NoticiaMotociclisme(titular, clubMotociclisme);
                break;
        }

        noticiesPerRedactor.get(dni).add(noticia);
        System.out.println("Noticia afegida.");
    }

    private static void eliminarNoticia(){
        System.out.print("Introdueix del dni del redactor: ");
        String dni = scanner.next();

        if (!noticiesPerRedactor.containsKey(dni)){
            System.out.println("Redactor no trobat.");
            return;
        }

        System.out.println("Introdueix el titular de la noticia");
        String titular = scanner.next();

        List<Noticia> noticies = noticiesPerRedactor.get(dni);
        Noticia noticiaEliminar = null;

        for (Noticia noticia : noticies){
            if (noticia.getTitular().equalsIgnoreCase(titular)){
                noticiaEliminar = noticia;
                break;
            }
        }

        if (noticiaEliminar != null) {
            noticies.remove(noticiaEliminar);
            System.out.println("Noticia eleminada.");
        }else{
            System.out.println("Noticia no trobada.");
        }
    }

    private static void mostrarNoticiesPerRedactor(){

        System.out.println("Introdueix del dni del redactor: ");
        String dni = scanner.next();

        if (!noticiesPerRedactor.containsKey(dni)){
            System.out.println("Redactor no trobat.");
            return;
        }

        List<Noticia> noticies = noticiesPerRedactor.get(dni);
        if(noticies.isEmpty()){
            System.out.println("No se han trobat noticies de aquest redactor.");
            return;
        }

        System.out.println("Noticies del redactor: " + dni + ":");
        for(Noticia n : noticies){
            System.out.println(n.getTitular());
            //System.out.println(n.getText());
        }
    }

    private static void calcularPuntuacioNoticia(){

        System.out.println("Introdueix del dni del redactor: ");
        String dni = scanner.next();

        if (!noticiesPerRedactor.containsKey(dni)){
            System.out.println("Redactor no trobat.");
            return;
        }

        System.out.print("Introdueix el titular de la noticia: ");
        String titular = scanner.next();

        List<Noticia> noticies = noticiesPerRedactor.get(dni);
        Noticia noticia = null;

        for(Noticia n : noticies){
            if (n.getTitular().equalsIgnoreCase(titular)){
                noticia = n;
            }
        }

        if (noticia != null) {
            System.out.println("La puntuacio de la noticia es: " + noticia.getPuntuacio());
        }else{
            System.out.println("No se ha trobat cap noticia anb squest titular");
        }
    }

    private static void calcularPreuNoticia(){

        System.out.println("Introdueix del dni del redactor: ");
        String dni = scanner.next();

        if (!noticiesPerRedactor.containsKey(dni)){
            System.out.println("Redactor no trobat.");
            return;
        }

        System.out.print("Introdueix el titular de la noticia: ");
        String titular = scanner.next();

        List<Noticia> noticies = noticiesPerRedactor.get(dni);
        Noticia noticia = null;

        for(Noticia n : noticies){
            if (n.getTitular().equalsIgnoreCase(titular)){
                noticia = n;
            }
        }

        if (noticia != null) {
            System.out.println("El preu de la noticia es: " + noticia.getPreu());
        }else{
            System.out.println("No se ha trobat cap noticia anb aquest titular");
        }

    }

}
