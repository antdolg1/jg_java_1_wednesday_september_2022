package students.student_ignat_parfenov.lesson_4.lessoncode;

public class HumanAgeClassifier {

    public String clacify(int age) {
        if (age > 0 && age <= 10) {
            return "Baby";
        } else if (age > 10 && age <= 17) {
            return "Teenager";
        } else if (age > 17 && age <= 30) {
            return "Student";
        } else if (age > 30 && age <= 60) {
            return "Depressive hard working person";
        } else if (age > 60 && age <= 129) {
            return "Happy retired person";
        } else {
            return "Wooow, you're undead!";
        }
    }
}