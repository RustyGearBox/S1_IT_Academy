public class Main {
    public static void main(String[] args) {

        // Internet value: 50 & Gas value: 100

        OnlineWorker worker1 = new OnlineWorker("Mario","Verdejo", 10,10);
        OnSiteWorker worker2 = new OnSiteWorker("Cristina","Morales",10,10);

        System.out.println(worker1 + " -> Salary: " + worker1.calculateSalary(100));
        System.out.println(worker2 + " -> Salary: " + worker2.calculateSalary(100));

    }
}