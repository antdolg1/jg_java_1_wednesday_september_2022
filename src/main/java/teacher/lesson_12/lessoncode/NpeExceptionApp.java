package teacher.lesson_12.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class NpeExceptionApp {

    //NPE = NullPointerException

    public static void main(String[] args) {

        NpeExceptionApp app = new NpeExceptionApp();

        List<String> stringList = new ArrayList<>();
        stringList.add("Zebra");
        stringList.add("Helicopter");
        stringList.add("Canada");
        stringList.add(null);
        stringList.add("Latvia");

        for (String stringListElement : stringList) {
//            try {
            if (!stringListElement.isBlank()) {
                app.printText(stringListElement);
            }
//            } catch (NullPointerException e) {
//                System.out.println(e.getMessage());
//                System.out.println("Exception was caught and processed! Program continues.");
//                e.printStackTrace();
//            } finally {
//                System.out.println("Inside of finally block!");
//            }
//            System.out.println("_____________");
        }
    }

    public void printText(String text) {
        if (text == null) {
            throw new NullPointerException("NullPointerException thrown! Text is NULL!");
        }
        System.out.println("Inside of printText method! Text is: " + text);
    }

}
