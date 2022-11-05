package students.student_svetlana_seda.lesson_4.homework.level_5;

class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        // detectTest(); НАДО?
        lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectTest();

    }

    private void detectTest() {

        int waveLength = 600;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult.equals(expectedResult)) {
            System.out.println("LightColorDetectorTest is OK");
        } else {
            System.out.println("LightColorDetectorTest is FAIL");
        }

    }

}

