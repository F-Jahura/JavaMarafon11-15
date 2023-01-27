package Day14Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task14_1 {
    public static void main(String[] args) {
        printSumDigits();
    }

    public static void printSumDigits(){
        File file = new File("Task14_1");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] lineSplit = line.split(" ");
            int sum = 0;
            if (lineSplit.length != 10){
                throw new IOException();
            }
            for (String numbers : lineSplit)
                sum = sum + Integer.parseInt(numbers);
            System.out.println("Total numbers in the file: " + sum);



        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        } catch (IOException e) {
            System.out.println("Data in the file is not correct.");
        }
    }
}
