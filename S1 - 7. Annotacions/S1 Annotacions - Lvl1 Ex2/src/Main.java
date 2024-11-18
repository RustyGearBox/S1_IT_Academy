public class Main {
    public static void main(String[] args) {

        OnlineWorker onlineWorker = new OnlineWorker("Matias","Meza",20);
        PresentWorker presencialWorker = new PresentWorker("Yunus", "Beltran", 15);

        int timeWorked = 40;

        double onlineSalary = onlineWorker.calculateSalary(timeWorked);
        double presentSalary = presencialWorker.calculateSalary(timeWorked);

        System.out.println("Online salary: " + onlineSalary);
        System.out.println("Present salary: " + presentSalary);

        SupportClass supportClass = new SupportClass();
        supportClass.useDeprecatedMethods(onlineWorker,presencialWorker);

    }

}

class SupportClass {

    @SuppressWarnings("deprecation")
    public void useDeprecatedMethods(OnlineWorker online, PresentWorker present) {
        online.showOlderInternetPlan();
        present.showOldGasPrice();
    }
}