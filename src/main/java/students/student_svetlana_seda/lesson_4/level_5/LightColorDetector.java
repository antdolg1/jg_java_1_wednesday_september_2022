package students.student_svetlana_seda.lesson_4.level_5;

public class LightColorDetector {

    public String detect(int waveLength) {
        String lightColor = null;
        if (waveLength >= 380 && waveLength <= 449) {
            lightColor = "Violet";
        } else if (waveLength >= 450 && waveLength <= 494) {
            lightColor = "Blue";
        } else if (waveLength >= 495 && waveLength <= 569) {
            lightColor = "Green";
        } else if (waveLength >= 570 && waveLength <= 589) {
            lightColor = "Yellow";
        } else if (waveLength >= 590 && waveLength <= 619) {
            lightColor = "Orange";
        } else if (waveLength >= 620 && waveLength <= 750) {
            lightColor = "Red";
        } else {
            lightColor = "Invisible Light";
        }
        return lightColor;

    }

}
