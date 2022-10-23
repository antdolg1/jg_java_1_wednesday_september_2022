package students.student_ilja_morozovs.lesson_4.homework.level_5.Task_16;

import java.util.Scanner;

class LightDetector {
    public static void main(String[] args) {
        int waveLength;
        LightColorDetector lightColorDetector = new LightColorDetector();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the light wave length: ");
        waveLength = scanner.nextInt();
        System.out.println("Light color is: " + lightColorDetector.detect(waveLength));
    }
}
