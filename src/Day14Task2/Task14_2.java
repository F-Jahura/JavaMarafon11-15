package Day14Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task14_2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());

    }

    public static List<String> parseFileToStringList(){
        List<String> people = new ArrayList<>();
        File file = new File("people");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] lineSplit = line.split(" ");
                people.add(line);
                if (Integer.parseInt(lineSplit[1]) < 0){
                    throw new IOException();
                }
            }
            return people;

        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        } catch (IOException e) {
            System.out.println("Data in the file is not correct.");
        }
        return null;
    }
}
