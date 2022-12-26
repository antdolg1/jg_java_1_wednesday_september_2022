package students.student_sergejs_kozinecs.lesson_4.level_5.Task_16;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.lightColorVioletTest();
        lightColorDetectorTest.lightColorBlueTest();
        lightColorDetectorTest.lightColorGreenTest();
        lightColorDetectorTest.lightColorOrangeTest();
        lightColorDetectorTest.lightColorRedTest();
        lightColorDetectorTest.lightColorYellowTest();
        lightColorDetectorTest.lightColorInvisibleTest();
    }

    public void lightColorVioletTest() {
        int wavelength = 380;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Light color is violet test = OK");
        } else {
            System.out.println("Light color is violet test = FAIL");
        }
    }

    public void lightColorBlueTest() {
        int wavelength = 450;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Light color is blue test = OK");
        } else {
            System.out.println("Light color is blue test = FAIL");
        }
    }

    public void lightColorGreenTest() {
        int wavelength = 500;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Light color is green test = OK");
        } else {
            System.out.println("Light color is green test = FAIL");
        }
    }

    public void lightColorYellowTest() {
        int wavelength = 580;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Light color is yellow test = OK");
        } else {
            System.out.println("Light color is yellow test = FAIL");
        }
    }

    public void lightColorOrangeTest() {
        int wavelength = 600;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Light color is orange test = OK");
        } else {
            System.out.println("Light color is orange test = FAIL");
        }
    }

    public void lightColorRedTest() {
        int wavelength = 700;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Light color is red test = OK");
        } else {
            System.out.println("Light color is red test = FAIL");
        }
    }

    public void lightColorInvisibleTest() {
        int wavelength = 3242;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Light color is invisible test = OK");
        } else {
            System.out.println("Light color is invisible test = FAIL");
        }
    }
}
