package students.student_zanna_klimova.lesson_4.level_5;

 class LightColorDetectorTest {
     static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.lightColorViolet();
        test.lightColorBlue();
        test.lightColorGreen();
        test.lightColorYellow();
        test.lightColorOrange();
        test.lightColorRed();
        test.lightColorInvisible();
    }

    void lightColorViolet() {
        LightColorDetector color = new LightColorDetector();
        int wavelength = 400;
        String expectedResult = "Violet";

        String actualTest = color.detect(wavelength);
        if(expectedResult.equals(actualTest)){
            System.out.println("Test lightColorViolet PASSED!");
        } else {
            System.out.println("Test lightColorViolet FAILED!");
            System.out.println("Expected result: " + expectedResult +
                    "\nActual result: " + actualTest);
        }
    }

    void lightColorBlue() {
        LightColorDetector color = new LightColorDetector();
        int wavelength = 450;
        String expectedResult = "Blue";

        String actualTest = color.detect(wavelength);
        if(expectedResult.equals(actualTest)){
            System.out.println("Test lightColorBlue PASSED!");
        } else {
            System.out.println("Test lightColorBlue FAILED!");
            System.out.println("Expected result: " + expectedResult +
                    "\nActual result: " + actualTest);
        }
    }

    void lightColorGreen() {
        LightColorDetector color = new LightColorDetector();
        int wavelength = 500;
        String expectedResult = "Green";

        String actualTest = color.detect(wavelength);
        if(expectedResult.equals(actualTest)){
            System.out.println("Test lightColorGreen PASSED!");
        } else {
            System.out.println("Test lightColorGreen FAILED!");
            System.out.println("Expected result: " + expectedResult +
                    "\nActual result: " + actualTest);
        }
    }

    void lightColorYellow() {
        LightColorDetector color = new LightColorDetector();
        int wavelength = 580;
        String expectedResult = "Yellow";

        String actualTest = color.detect(wavelength);
        if(expectedResult.equals(actualTest)){
            System.out.println("Test lightColorYellow PASSED!");
        } else {
            System.out.println("Test lightColorYellow FAILED!");
            System.out.println("Expected result: " + expectedResult +
                    "\nActual result: " + actualTest);
        }
    }

    void lightColorOrange() {
        LightColorDetector color = new LightColorDetector();
        int wavelength = 600;
        String expectedResult = "Orange";

        String actualTest = color.detect(wavelength);
        if(expectedResult.equals(actualTest)){
            System.out.println("Test lightColorOrange PASSED!");
        } else {
            System.out.println("Test lightColorOrange FAILED!");
            System.out.println("Expected result: " + expectedResult +
                    "\nActual result: " + actualTest);
        }
    }

    void lightColorRed() {
        LightColorDetector color = new LightColorDetector();
        int wavelength = 700;
        String expectedResult = "Red";

        String actualTest = color.detect(wavelength);
        if(expectedResult.equals(actualTest)){
            System.out.println("Test lightColorRed PASSED!");
        } else {
            System.out.println("Test lightColorRed FAILED!");
            System.out.println("Expected result: " + expectedResult +
                    "\nActual result: " + actualTest);
        }
    }

    void lightColorInvisible() {
        LightColorDetector color = new LightColorDetector();
        int wavelength = 800;
        String expectedResult = "Invisible Light";

        String actualTest = color.detect(wavelength);
        if(expectedResult.equals(actualTest)){
            System.out.println("Test lightColorInvisibleLight PASSED!");
        } else {
            System.out.println("Test lightColorInvisibleLight FAILED!");
            System.out.println("Expected result: " + expectedResult +
                    "\nActual result: " + actualTest);
        }
    }
}
