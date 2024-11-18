public class OnlineWorker extends Worker{

    private static final double internetBill = 60.00;

    public OnlineWorker(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(int timeWorked) {
        return (timeWorked * priceHour) + internetBill;
    }

    @Deprecated
    public void showOlderInternetPlan() {
        System.out.println("This plan is not longer available, it's deprecated. You have to pay: " + internetBill);
    }
}