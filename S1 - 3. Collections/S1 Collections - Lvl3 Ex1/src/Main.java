import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Person> people = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        loadPeopleFromFile("people.csv");

        do {
            System.out.println("\nMenu:");
            System.out.println("1.- Add person.");
            System.out.println("2.- Show people sorted by name (A-Z).");
            System.out.println("3.- Show people sorted by name (Z-A).");
            System.out.println("4.- Show people sorted by surname (A-Z).");
            System.out.println("5.- Show people sorted by surname (Z-A).");
            System.out.println("6.- Show people sorted by DNI (1-9).");
            System.out.println("7.- Show people sorted by DNI (9-1).");
            System.out.println("0.- Exit.");
            System.out.print("Select an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addPerson(scanner);
                    break;
                case 2:
                    sortAndDisplayPeople(Comparator.comparing(Person::getName), "Name (A-Z)");
                    break;
                case 3:
                    sortAndDisplayPeople(Comparator.comparing(Person::getName).reversed(), "Name (Z-A)");
                    break;
                case 4:
                    sortAndDisplayPeople(Comparator.comparing(Person::getSurname), "Surname (A-Z)");
                    break;
                case 5:
                    sortAndDisplayPeople(Comparator.comparing(Person::getSurname).reversed(), "Surname (Z-A)");
                    break;
                case 6:
                    sortAndDisplayPeople(Comparator.comparing(Person::getDni), "DNI (1-9)");
                    break;
                case 7:
                    sortAndDisplayPeople(Comparator.comparing(Person::getDni).reversed(), "DNI (9-1)");
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 0);
    }

    private static void loadPeopleFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 3) {
                    people.add(new Person(fields[0].trim(), fields[1].trim(), fields[2].trim()));
                }
            }
            System.out.println("Data loaded successfully from the file.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    private static void addPerson(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter DNI: ");
        String dni = scanner.nextLine();
        people.add(new Person(name, surname, dni));
        System.out.println("Person added successfully.");
    }

    private static void sortAndDisplayPeople(Comparator<Person> comparator, String criterion) {
        Collections.sort(people, comparator);
        System.out.println("\nPeople list sorted by " + criterion + ":");
        System.out.println("___Name___  ____Surnames____  __DNI__");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}