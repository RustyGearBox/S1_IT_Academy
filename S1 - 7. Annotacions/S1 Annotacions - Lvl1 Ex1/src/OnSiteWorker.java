public class OnSiteWorker extends Worker{

    private double gas = 100;

    public OnSiteWorker(String name, String surname, double priceHour, double monthHours) {
        super(name, surname, priceHour, monthHours);
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    @Override
    public double calculateSalary(double monthHour) {
        return (monthHour * this.getPriceHour()) + this.gas;
    }

    @Override
    public String toString() {
        return "Onsite Worker -> Name: " + super.getName() + ", Surname: " + super.getSurname() + ", " +
                "PriceHour: " + super.getPriceHour() +  ", MonthHour: " + super.getMonthHours() + ", Gas: " + this.gas;
    }

}