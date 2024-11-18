public abstract class Worker {

    private String name, surname;
    private double priceHour, monthHours;

    public Worker(String name, String surname, double priceHour, double monthHours) {
        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
        this.monthHours = monthHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(double priceHour) {
        this.priceHour = priceHour;
    }

    public double getMonthHours() {
        return monthHours;
    }

    public void setMonthHours(double monthHours) {
        this.monthHours = monthHours;
    }

    public abstract double calculateSalary(double monthHour);

    @Override
    public String toString() {
        return "Worker -> Name: " + name + ", Surname: " + surname + ", " +
                "PriceHour: " + priceHour +  ", MonthHour: " + monthHours;
    }

}