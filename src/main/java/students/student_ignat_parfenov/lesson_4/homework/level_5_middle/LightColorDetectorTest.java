package students.student_ignat_parfenov.lesson_4.homework.level_5_middle;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest test = new LightColorDetectorTest();
        test.LightColorDetectorViolet();
        test.LightColorDetectorBlue();
        test.LightColorDetectorGreen();
        test.LightColorDetectorYellow();
        test.LightColorDetectorOrange();
        test.LightColorDetectorRed();
        test.LightColorDetectorInvisibleLight();
    }

    void LightColorDetectorViolet() {
        LightColorDetector victim = new LightColorDetector();

        int waveLength = 380;
        String expectedResult = "Violet";

        String actualResult = victim.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test is PASSED. Light color is violet.");
        } else {
            System.out.println("FAIL");
        }
    }

    void LightColorDetectorBlue() {
        LightColorDetector victim = new LightColorDetector();

        int waveLength = 460;
        String expectedResult = "Blue";
        String actualResult = victim.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test is PASSED. Light color is blue.");
        } else {
            System.out.println("FAIL");
        }
    }

    void LightColorDetectorGreen() {
        LightColorDetector victim = new LightColorDetector();

        int waveLength = 550;
        String expectedResult = "Green";
        String actualResult = victim.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test is PASSED. Light color is green.");
        } else {
            System.out.println("FAIL");
        }
    }

    void LightColorDetectorYellow() {
        LightColorDetector victim = new LightColorDetector();

        int waveLength = 580;
        String expectedResult = "Yellow";
        String actualResult = victim.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test is PASSED. Light color is yellow.");
        } else {
            System.out.println("FAIL");
        }
    }

    void LightColorDetectorOrange() {
        LightColorDetector victim = new LightColorDetector();

        int waveLength = 660;
        String expectedResult = "Orange";
        String actualResult = victim.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test is PASSED. Light color is orange.");
        } else {
            System.out.println("FAIL");
        }
    }

    void LightColorDetectorRed() {
        LightColorDetector victim = new LightColorDetector();

        int waveLength = 640;
        String expectedResult = "Red";
        String actualResult = victim.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test is PASSED. Light color is red.");
        } else {
            System.out.println("FAIL");
        }
    }

    void LightColorDetectorInvisibleLight() {
        LightColorDetector victim = new LightColorDetector();

        int waveLength = 400;
        String expectedResult = "Invisible Light";
        String actualResult = victim.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test is PASSED. Invisible light spectrum!");
        } else {
            System.out.println("FAIL");
        }
    }
}


