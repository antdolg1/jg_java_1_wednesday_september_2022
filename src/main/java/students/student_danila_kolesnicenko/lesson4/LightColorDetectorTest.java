package students.student_danila_kolesnicenko.lesson4;

import static students.student_danila_kolesnicenko.lesson4.LightColorDetector.detect;

class LightColorDetectorTest {
    public static void main(String[] args) {

        System.out.println(detect(440));
        System.out.println(detect(451));
        System.out.println(detect(496));
        System.out.println(detect(571));
        System.out.println(detect(591));
        System.out.println(detect(621));
        System.out.println(detect(40));

    }

}
