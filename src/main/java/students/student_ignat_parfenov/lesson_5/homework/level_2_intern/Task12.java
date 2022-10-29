package students.student_ignat_parfenov.lesson_5.homework.level_2_intern;

public class Task12 {

    public static void main(String[] args) {
        int[] randomArray = new int[3];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < randomArray.length; i++) {
            System.out.println(randomArray[i]);
        }
    }
}
