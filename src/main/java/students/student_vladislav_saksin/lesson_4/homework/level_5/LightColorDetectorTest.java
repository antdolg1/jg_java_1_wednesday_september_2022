package students.student_vladislav_saksin.lesson_4.homework.level_5;

// First two values done, to prevent complicated copypaste

import java.util.Scanner;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetColor();
        lightColorDetectorTest.blueColor();
    }

    void violetColor() {
        LightColorDetector victim = new LightColorDetector();

        Scanner scanner = new Scanner(System.in);

        int violet;
        String expectedResult = "Violet";
        System.out.println("Enter a number to check the violet light:");
        violet = scanner.nextInt();


        String actualResult = victim.detect(violet);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test violet color = PASSED");
        } else {
            System.out.println("Test violet color = FAIL");
            System.out.println("Expected result " + expectedResult + ". Actual result " + actualResult);
        }

    }

    void blueColor() {
        LightColorDetector victim = new LightColorDetector();

        Scanner scanner = new Scanner(System.in);

        int blue;
        String expectedResult = "Blue";
        System.out.println("Enter a number to check the blue light:");
        blue = scanner.nextInt();


        String actualResult = victim.detect(blue);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test blue color = PASSED");
        } else {
            System.out.println("Test blue color = FAIL");
            System.out.println("Expected result " + expectedResult + ". Actual result " + actualResult);
        }

    }

}


