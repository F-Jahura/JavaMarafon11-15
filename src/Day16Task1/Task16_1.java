package Day16Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task16_1 {
    public static void main(String[] args) {

        printResult();
    }

    public static void printResult(){
       File file = new File("Task16_1.txt");
        try {
            Scanner scanner = new Scanner(file);
            String[] lineSplit = scanner.nextLine().split(" ");
            int sum = 0;
            for (String numbers : lineSplit){
                sum = sum + Integer.parseInt(numbers);
            }
            System.out.print("Average value: " + sum / (double) lineSplit.length);
            System.out.printf("  ---> %.3f" , sum / (double) lineSplit.length);

        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        }
    }
}
