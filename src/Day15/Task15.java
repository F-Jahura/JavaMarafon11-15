package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        File file = new File("shoes.csv");
        File fileCreate = new File("shoes.txt");
        try {
            Scanner scanner = new Scanner(file);
            PrintWriter printWriter = new PrintWriter(fileCreate);
            while (scanner.hasNextLine()){
                String[] fileSplit = scanner.nextLine().split(";");
                if (Integer.parseInt(fileSplit[2]) == 0){
                    printWriter.println(fileSplit[0] + "; " + fileSplit[1] + "; " + fileSplit[2]);
                }
            }
            scanner.close();
            printWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        }

    }
}
