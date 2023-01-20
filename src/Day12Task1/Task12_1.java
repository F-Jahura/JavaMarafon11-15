package Day12Task1;

import java.util.ArrayList;
import java.util.List;

public class Task12_1 {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();
        carList.add("Toyota");
        carList.add("Honda");
        carList.add("Range Rover");
        carList.add("Mercedes");
        carList.add("Ford");

        System.out.println(carList);
        carList.add(3, "Audi");
        carList.remove(0);
        System.out.println(carList);

    }
}
