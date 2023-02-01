package Day16Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task16_2 {
    public static void main(String[] args) throws FileNotFoundException {
        printResult();
    }

    public static void printResult() throws FileNotFoundException {
        File file1 = new File("Task16_2_file1.txt");
        File file2 = new File("Task16_2_file2.txt");
        PrintWriter printWriter1 = new PrintWriter(file1);
        PrintWriter printWriter2 = new PrintWriter(file2);
        Random random = new Random();

        for (int i = 0; i< 1000; i++) {
            printWriter1.println(random.nextInt(100));
        }
        printWriter1.close();
        Scanner scanner = new Scanner(file1);
        int sum = 0;
        int count = 0;
        while(scanner.hasNextLine()){
            String numbers = scanner.nextLine();
            sum = sum + Integer.parseInt(numbers);
            count++;
            if (count == 20){
                double average_value = sum/20.0;
                printWriter2.println(average_value);
                sum = 0;
                count = 0;
            }
        }
        printWriter2.close();

        Scanner scanner1 = new Scanner(file2);
        double sumAll = 0;
        while (scanner1.hasNextLine()){
            String sumNumbers = scanner1.nextLine();
            sumAll = sumAll + Double.parseDouble(sumNumbers);
        }
        System.out.println((int) sumAll);
    }
}
