package students.student_svetlana_seda.lesson_4.homework.level_5;

import java.util.Scanner;

class LightColorDetectorDemo {

    public static void main(String[] args) {
        int waveLength;
        LightColorDetector lightColorDetector = new LightColorDetector();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the light wave length: ");
        waveLength = scanner.nextInt();
        System.out.println("Light color is: " + lightColorDetector.detect(waveLength));
    }

}
