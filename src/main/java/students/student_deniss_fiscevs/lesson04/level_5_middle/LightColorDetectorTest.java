package students.student_deniss_fiscevs.lesson04.level_5_middle;

public class LightColorDetectorTest {

    public static void main(String[] args){

        LightColorDetectorTest test = new LightColorDetectorTest();
        test.shouldBeViolet();
        test.shouldBeBlue();
        test.shouldBeGreen();
        test.shouldBeYellow();
        test.shouldBeOrange();
        test.shouldBeRed();
        test.shouldBeInvisibleLight();

    }

    void shouldBeViolet() {

        LightColorDetector victim = new LightColorDetector();

        int wavelength = 400;
        String expectedResult = "Violet";
        String actualResult = victim.detect(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldBeViolet PASSED!");
        } else {
            System.out.println("Test shouldBeViolet FAILED!");
            System.out.println("Expected " + expectedResult + "\nActual result " + actualResult);
        }
    }

    void shouldBeBlue() {

        LightColorDetector victim = new LightColorDetector();

        int wavelength = 490;
        String expectedResult = "Blue";
        String actualResult = victim.detect(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldBeBlue PASSED!");
        } else {
            System.out.println("Test shouldBeBlue FAILED!");
            System.out.println("Expected " + expectedResult + "\nActual result " + actualResult);
        }
    }

    void shouldBeGreen() {

        LightColorDetector victim = new LightColorDetector();

        int wavelength = 550;
        String expectedResult = "Green";
        String actualResult = victim.detect(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldBeGreen PASSED!");
        } else {
            System.out.println("Test shouldBeGreen FAILED!");
            System.out.println("Expected " + expectedResult + "\nActual result " + actualResult);
        }
    }

    void shouldBeYellow() {

        LightColorDetector victim = new LightColorDetector();

        int wavelength = 580;
        String expectedResult = "Yellow";
        String actualResult = victim.detect(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldBeYellow PASSED!");
        } else {
            System.out.println("Test shouldBeYellow FAILED!");
            System.out.println("Expected " + expectedResult + "\nActual result " + actualResult);
        }
    }

    void shouldBeOrange() {

        LightColorDetector victim = new LightColorDetector();

        int wavelength = 611;
        String expectedResult = "Orange";
        String actualResult = victim.detect(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldBeOrange PASSED!");
        } else {
            System.out.println("Test shouldBeOrange FAILED!");
            System.out.println("Expected " + expectedResult + "\nActual result " + actualResult);
        }
    }

    void shouldBeRed() {

        LightColorDetector victim = new LightColorDetector();

        int wavelength = 621;
        String expectedResult = "Red";
        String actualResult = victim.detect(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldBeRed PASSED!");
        } else {
            System.out.println("Test shouldBeRed FAILED!");
            System.out.println("Expected " + expectedResult + "\nActual result " + actualResult);
        }
    }

    void shouldBeInvisibleLight() {

        LightColorDetector victim = new LightColorDetector();

        int wavelength = 2;
        String expectedResult = "Invisible light";
        String actualResult = victim.detect(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldBeInvisibleLight PASSED!");
        } else {
            System.out.println("Test shouldBeInvisibleLight FAILED!");
            System.out.println("Expected " + expectedResult + "\nActual result " + actualResult);
        }
    }

}
