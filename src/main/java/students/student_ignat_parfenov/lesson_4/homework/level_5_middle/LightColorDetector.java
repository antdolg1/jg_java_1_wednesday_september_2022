package students.student_ignat_parfenov.lesson_4.homework.level_5_middle;

public class LightColorDetector {

    public String detect(int wavelength) {

        if (wavelength > 379 && wavelength < 450)  {
            System.out.println("Light color is violet.");
        } else if (wavelength > 449 && wavelength < 495) {
            System.out.println("Light color is blue.");
        } else if (wavelength > 494 && wavelength < 570) {
            System.out.println("Light color is green.");
        } else if (wavelength > 569 && wavelength < 590) {
            System.out.println("Light color is yellow");
        } else if (wavelength > 589 && wavelength < 620) {
            System.out.println("Light color is orange");
        } else if (wavelength > 619 && wavelength < 751) {
            System.out.println("Light color is red.");
        }   else {
            System.out.println("Out of visible spectrum. Invisible Light");
        }
        return null;
    }
}
