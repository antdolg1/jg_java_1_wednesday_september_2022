package students.student_oleg_gryazev.lesson_4.level_5;

import java.util.Scanner;

class LightColorDetector {

    public static void main(String[] args) {


        Light light = new Light();
        light.massiveLight();
        {
            int[] x = new int[1000];
            int i;
            for (i = 380; i <= 750; i++) {
                x[i] = i;
                int a = x[i];

                if (a < 380 && a > 750) {

                    System.out.println("Invisible spectr");
                } else if (a >= 380 && a <= 449) {
                    light.violet();
                } else if (a >= 450 && a <= 494) {
                    light.blue();
                } else if (a >= 495 && a <= 569) {
                    light.green();
                } else if (a >= 570 && a <= 589) {
                    light.yellow();
                } else if (a >= 590 && a <= 619) {
                    light.orange();
                } else if (a >= 620 && a <= 750) {
                    light.red();
                }
            }
        }
    }
}

