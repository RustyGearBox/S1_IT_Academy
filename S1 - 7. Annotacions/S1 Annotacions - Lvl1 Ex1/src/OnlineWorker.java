public class OnlineWorker extends Worker{

    private double internetFee = 50;

    public OnlineWorker(String name, String surname, double priceHour, double monthHours) {
        super(name, surname, priceHour, monthHours);
    }

    public double getInternetFee() {
        return internetFee;
    }

    public void setInternetFee(double internetFee) {
        this.internetFee = internetFee;
    }

    @Override
    public String toString() {
        return "Online Worker -> Name: " + super.getName() + ", Surname: " + super.getSurname() + ", " +
                "PriceHour: " + super.getPriceHour() +  ", MonthHour: " + super.getMonthHours() + ", Internet: " + this.internetFee;
    }

    @Override
    public double calculateSalary(double monthHour) {
        return (monthHour * this.getPriceHour()) + this.internetFee;
    }

}