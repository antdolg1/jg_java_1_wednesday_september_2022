package students.student_raivis_urbevics.lesson4_level5.task16;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectorTest();
    }



        public void detectorTest() {
            int waveLength = 565;
            String lightColorResult = "Green";
            LightColorDetector lightColorDetector = new LightColorDetector();
            String realLightColorResult = lightColorDetector.detect(waveLength);
            if (realLightColorResult.equals(lightColorResult)) {
                System.out.println("LightColorDetectorTest = OK");
            } else {
                System.out.println("LightColorDetectorTest = FAIL");


            }
        }
    }




















