package Day12Task2;

import java.util.ArrayList;
import java.util.List;

public class Task12_2 {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();

        for (int i = 0; i <= 30; i++){
            if (i % 2 == 0){
                listNumbers.add(i);
            }
        }

        for (int i = 300; i <= 350; i++){
            if (i % 2 == 0){
                listNumbers.add(i);
            }
        }

        System.out.println(listNumbers);
    }
}
