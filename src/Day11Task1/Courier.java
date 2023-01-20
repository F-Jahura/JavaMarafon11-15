package Day11Task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;

    Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }


    @Override
    public void doWork() {
        salary = salary + 100;
        warehouse.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000){
            System.out.println("Bonus is not available yet.");
        }
        if (isPayed){
            System.out.println("Bonus is paid already.");
        }
        salary = salary + 50000;
        isPayed = true;

    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", warehouse=" + warehouse +
                '}';
    }
}
