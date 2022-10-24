package students.student_oskars_popens.lesson_4.level_7_senior;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.lightTests(405, "Violet");
        lightColorDetector.lightTests(475, "Blue");
        lightColorDetector.lightTests(505, "Green");
        lightColorDetector.lightTests(585, "Yellow");
        lightColorDetector.lightTests(619, "Orange");
        lightColorDetector.lightTests(620, "Red");
        lightColorDetector.lightTests(760, "Invisible Light");
    }

    void lightTests(int waveLength, String expectedColor) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (result.equals(expectedColor)) {
            System.out.println("LightColorDetector test - " + expectedColor + " = OK");
        } else {
            System.out.println("LightColorDetector test - " + expectedColor + " = FAIL");
        }
    }

}

