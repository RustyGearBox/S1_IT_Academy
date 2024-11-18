public class Worker {

    private static double gas = 120.00;

    protected String name, surname;
    protected double priceHour;

    public Worker(String name, String surname, double priceHour) {
        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
    }

    public double calculateSalary(int timeWorked) {
        return (timeWorked * priceHour) + gas;
    }
}