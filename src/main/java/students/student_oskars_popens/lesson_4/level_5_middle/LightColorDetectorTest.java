package students.student_oskars_popens.lesson_4.level_5_middle;

class LightColorDetectorTest {
    void lightColorDetectorTest() {
        String expectedResult;
        String realResult;
        int waveMin, waveMax;
        boolean isOk;
        LightColorDetector colorDetector = new LightColorDetector();

        // violet test
        expectedResult = "Violet";
        waveMin = 380;
        waveMax = 449;
        isOk = true;
        for (int waveLength = waveMin; waveLength <=waveMax ; waveLength++) {
            realResult = colorDetector.detect(waveLength);
            if (! expectedResult.equals(realResult)){
                isOk = false;
                break;
            }
        }
        if (isOk){
            System.out.println("Violet wave length test = OK");
        } else {
            System.out.println("Violet wave length test = FAIL");
        }

        // blue test
        expectedResult = "Blue";
        waveMin = 450;
        waveMax = 494;
        isOk = true;
        for (int waveLength = waveMin; waveLength <=waveMax ; waveLength++) {
            realResult = colorDetector.detect(waveLength);
            if (! expectedResult.equals(realResult)){
                isOk = false;
                break;
            }
        }
        if (isOk){
            System.out.println("Blue wave length test = OK");
        } else {
            System.out.println("Blue wave length test = FAIL");
        }

        // gree test
        expectedResult = "Green";
        waveMin = 495;
        waveMax = 569;
        isOk = true;
        for (int waveLength = waveMin; waveLength <=waveMax ; waveLength++) {
            realResult = colorDetector.detect(waveLength);
            if (! expectedResult.equals(realResult)){
                isOk = false;
                break;
            }
        }
        if (isOk){
            System.out.println("Green wave length test = OK");
        } else {
            System.out.println("Green wave length test = FAIL");
        }

        // Yellow test
        expectedResult = "Yellow";
        waveMin = 570;
        waveMax = 589;
        isOk = true;
        for (int waveLength = waveMin; waveLength <=waveMax ; waveLength++) {
            realResult = colorDetector.detect(waveLength);
            if (! expectedResult.equals(realResult)){
                isOk = false;
                break;
            }
        }
        if (isOk){
            System.out.println("Yellow wave length test = OK");
        } else {
            System.out.println("Yellow wave length test = FAIL");
        }

        // orange test
        expectedResult = "Orange";
        waveMin = 590;
        waveMax = 619;
        isOk = true;
        for (int waveLength = waveMin; waveLength <=waveMax ; waveLength++) {
            realResult = colorDetector.detect(waveLength);
            if (! expectedResult.equals(realResult)){
                isOk = false;
                break;
            }
        }
        if (isOk){
            System.out.println("Orange wave length test = OK");
        } else {
            System.out.println("Orange wave length test = FAIL");
        }

        // red test
        expectedResult = "Red";
        waveMin = 620;
        waveMax = 750;
        isOk = true;
        for (int waveLength = waveMin; waveLength <=waveMax ; waveLength++) {
            realResult = colorDetector.detect(waveLength);
            if (! expectedResult.equals(realResult)){
                isOk = false;
                break;
            }
        }
        if (isOk){
            System.out.println("Red wave length test = OK");
        } else {
            System.out.println("Red wave length test = FAIL");
        }

        // Invisible light test 1
        expectedResult = "Invisible Light";
        waveMin = 0;
        waveMax = 379;
        isOk = true;
        for (int waveLength = waveMin; waveLength <=waveMax ; waveLength++) {
            realResult = colorDetector.detect(waveLength);
            if (! expectedResult.equals(realResult)){
                isOk = false;
                break;
            }
        }
        if (isOk){
            System.out.println("Invisible Light wave length < 380 test = OK");
        } else {
            System.out.println("Invisible Light wave length < 380 test = FAIL");
        }

        // Invisible light test 2
        expectedResult = "Invisible Light";
        waveMin = 751;
        waveMax = 999;
        isOk = true;
        for (int waveLength = waveMin; waveLength <=waveMax ; waveLength++) {
            realResult = colorDetector.detect(waveLength);
            if (! expectedResult.equals(realResult)){
                isOk = false;
                break;
            }
        }
        if (isOk){
            System.out.println("Invisible Light wave length > 750 test = OK");
        } else {
            System.out.println("Invisible Light wave length > 750test = FAIL");
        }

    }

    public static void main(String[] args) {
        LightColorDetectorTest colorDetectorTest = new LightColorDetectorTest();

        colorDetectorTest.lightColorDetectorTest();
    }
}
