package students.student_konstantin_karetnikov.Homework.Lesson4.Level5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.Violet();
        lightColorDetectorTest.Blue();
        lightColorDetectorTest.Green();
        lightColorDetectorTest.Yellow();
        lightColorDetectorTest.Orange();
        lightColorDetectorTest.Red();
        lightColorDetectorTest.Invisible();
    }

    void Violet() {
        int waveLength = 400;
        String ColorResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColorResult = lightColorDetector.detect(waveLength);
        if (realColorResult.equals(ColorResult)) {
            System.out.println("Violet TEST = OK");
        } else {
            System.out.println("Violet TEST = FAIL");
        }
    }
    void Blue() {
        int waveLength = 460;
        String ColorResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColorResult = lightColorDetector.detect(waveLength);
        if (realColorResult.equals(ColorResult)) {
            System.out.println("Blue TEST = OK");
        } else {
            System.out.println("Blue TEST = FAIL");
        }
    }
    void Green() {
        int waveLength = 500;
        String ColorResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColorResult = lightColorDetector.detect(waveLength);
        if (realColorResult.equals(ColorResult)) {
            System.out.println("Green TEST = OK");
        } else {
            System.out.println("Green TEST = FAIL");
        }
    }
    void Yellow() {
        int waveLength = 580;
        String ColorResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColorResult = lightColorDetector.detect(waveLength);
        if (realColorResult.equals(ColorResult)) {
            System.out.println("Yellow TEST = OK");
        } else {
            System.out.println("Yellow TEST = FAIL");
        }
    }
    void Orange() {
        int waveLength = 600;
        String ColorResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColorResult = lightColorDetector.detect(waveLength);
        if (realColorResult.equals(ColorResult)) {
            System.out.println("Orange TEST = OK");
        } else {
            System.out.println("Orange TEST = FAIL");
        }
    }
    void Red() {
        int waveLength = 700;
        String ColorResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColorResult = lightColorDetector.detect(waveLength);
        if (realColorResult.equals(ColorResult)) {
            System.out.println("Red TEST = OK");
        } else {
            System.out.println("Red TEST = FAIL");
        }
    }
    void Invisible() {
        int waveLength = 10;
        String ColorResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColorResult = lightColorDetector.detect(waveLength);
        if (realColorResult.equals(ColorResult)) {
            System.out.println("Invisible TEST = OK");
        } else {
            System.out.println("Invisible TEST = FAIL");
        }
    }

}
