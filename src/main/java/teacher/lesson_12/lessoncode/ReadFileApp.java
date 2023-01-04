package teacher.lesson_12.lessoncode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileApp {

    public static void main(String[] args) {

        String separator = File.separator;

        String pathToFile = separator + "Users" + separator + "antonsdolgopolovs/Desktop/Lesson2.txt";

        File file = new File(pathToFile);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File with such name was not found, please double check!");
            e.printStackTrace();
        }

    }

}
