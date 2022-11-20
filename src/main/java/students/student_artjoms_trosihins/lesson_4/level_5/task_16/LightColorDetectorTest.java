package students.student_artjoms_trosihins.lesson_4.level_5.task_16;

class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest test = new LightColorDetectorTest();
        test.shouldDetectViolet();
        test.shouldDetectBlue();
        test.shouldDetectGreen();
        test.shouldDetectYellow();
        test.shouldDetectOrange();
        test.shouldDetectRed();
        test.shouldDetectInvisibleLight();
    }

    void shouldDetectViolet() {
        LightColorDetector victim = new LightColorDetector();

        int wavelength = 400;
        String expectedResult = "Violet";

        String actualResult = victim.detect(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected result " + expectedResult + "actual result " + actualResult);
        }
    }

    void shouldDetectBlue() {
        LightColorDetector victim = new LightColorDetector();

        int waveLength = 451;
        String expectedResult = "Blue";

        String actualResult = victim.detect(waveLength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }

    void shouldDetectGreen() {
        LightColorDetector victim = new LightColorDetector();

        int wave = 500;
        String expectedResult = "Green";

        String actualResult = victim.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }

    void shouldDetectYellow() {
        LightColorDetector victim = new LightColorDetector();

        int wave = 580;
        String expectedResult = "Yellow";

        String actualResult = victim.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }

    void shouldDetectOrange() {
        LightColorDetector victim = new LightColorDetector();

        int wave = 600;
        String expectedResult = "Orange";

        String actualResult = victim.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }

    void shouldDetectRed() {
        LightColorDetector victim = new LightColorDetector();

        int wave = 700;
        String expectedResult = "Red";

        String actualResult = victim.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }

    void shouldDetectInvisibleLight() {
        LightColorDetector victim = new LightColorDetector();

        int wave = 1000;
        String expectedResult = "Invisible Light";

        String actualResult = victim.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
}
