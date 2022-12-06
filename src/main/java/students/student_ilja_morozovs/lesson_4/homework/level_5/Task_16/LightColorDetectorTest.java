package students.student_ilja_morozovs.lesson_4.homework.level_5.Task_16;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectTest();
    }

    void detectTest() {
        int waveLength = 2000;
        String lightColoResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realLightColorResult = lightColorDetector.detect(waveLength);
        if (realLightColorResult.equals(lightColoResult)) {
            System.out.println("Light color detect TEST = OK");
        } else {
            System.out.println("Light color detect TEST = FAIL");
        }
    }
}
