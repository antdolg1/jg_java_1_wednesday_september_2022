package students.student_raivis_urbevics.lesson4_level5.task16;

import java.util.Scanner;

public class ColorDetector {
    public static void main(String[] args) {
        System.out.println("Please enter the wavelength");
        Scanner scanner=new Scanner(System.in);
        int wavelength;
        LightColorDetector lightColorDetector=new LightColorDetector();
        wavelength=scanner.nextInt();
        System.out.println("Color is " + lightColorDetector.detect(wavelength) );


    }
}
