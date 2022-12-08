package students.student_konstantin_karetnikov.Homework.Lesson4.Level5;

import java.util.Scanner;

 class LightColorDetectorDemo {
    public static void main(String[] args) {
        int waveLength;
        LightColorDetector lightColorDetector = new LightColorDetector();
        System.out.print("Wave length is ");
        Scanner scanner = new Scanner(System.in);
        waveLength = scanner.nextInt();
        System.out.println("This is " + lightColorDetector.detect(waveLength) + " color");
    }
}
