package students.student_ignat_parfenov.lesson_4.homework.level_5_middle;

public class LightColorDetector {

    public String detect(int wavelength) {

        if (wavelength > 379 && wavelength < 450)  {
            return "Violet";
        } else if (wavelength > 449 && wavelength < 495) {
            return "Blue";
        } else if (wavelength > 494 && wavelength < 570) {
            return "Green";
        } else if (wavelength > 569 && wavelength < 590) {
            return "Yellow";
        } else if (wavelength > 589 && wavelength < 620) {
            return "Orange";
        } else if (wavelength > 619 && wavelength < 751) {
            return "Red";
        }   else {
            return "Invisible Light";
        }
    }
}
