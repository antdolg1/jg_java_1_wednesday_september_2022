package students.student_sergejs_kozinecs.lesson_4.level_7.Task_25;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        LightColorDetector lightColorDetector = new LightColorDetector();

        lightColorDetectorTest.testViolet(lightColorDetector.detect(405));
        lightColorDetectorTest.testBlue(lightColorDetector.detect(475));
        lightColorDetectorTest.testGreen(lightColorDetector.detect(505));
        lightColorDetectorTest.testYellow(lightColorDetector.detect(585));
        lightColorDetectorTest.testOrange(lightColorDetector.detect(619));
        lightColorDetectorTest.testRed(lightColorDetector.detect(620));
        lightColorDetectorTest.testInvisible(lightColorDetector.detect(760));
    }

    void printTestResult(String title, boolean result) {
        if (result) {
            System.out.println(title + " = OK");
        } else {
            System.out.println(title + " = FAIL");
        }
    }

    public void testViolet(String result) {
        printTestResult("LightColorDetector test - Violet", result.equals("Violet"));
    }

    public void testBlue(String result) {
        printTestResult("LightColorDetector test - Blue", result.equals("Blue"));
    }

    public void testGreen(String result) {
        printTestResult("LightColorDetector test - Green", result.equals("Green"));
    }

    public void testYellow(String result) {
        printTestResult("LightColorDetector test - Yellow", result.equals("Yellow"));
    }

    public void testOrange(String result) {
        printTestResult("LightColorDetector test - Orange", result.equals("Orange"));
    }

    public void testRed(String result) {
        printTestResult("LightColorDetector test - Red", result.equals("Red"));
    }

    public void testInvisible(String result) {
        printTestResult("LightColorDetector test - Invisible Light", result.equals("Invisible Light"));
    }
}
