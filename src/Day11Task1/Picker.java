package Day11Task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary = salary + 80;
        warehouse.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000){
            System.out.println("Bonus is not available yet");
        }
        if (isPayed){
            System.out.println("Bonus is already paid");
        }
        salary = salary + 70000;
        isPayed = true;

    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", warehouse=" + warehouse +
                '}';
    }
}
