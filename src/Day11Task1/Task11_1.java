package Day11Task1;

public class Task11_1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(picker);
        System.out.println(picker); 
        businessProcess(courier);
        System.out.println(courier);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        picker2.doWork();
        courier2.doWork();

        System.out.println(picker);
        System.out.println(courier);


    }

    public static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
