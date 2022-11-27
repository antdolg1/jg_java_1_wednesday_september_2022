package students.student_ignat_parfenov.lesson_8.homework.level_1_2_intern;

public class FraudDetectorTest {
    public static void main(String[] args) {

        Trader trader1 = new Trader("Pokemon", "New York");

        if (trader1.getFullName().equals("Pokemon")) {
            System.out.println("Transaction is interrupted. Test is FAILED");
        } else {
            System.out.println("Transaction is done. Test is OK");
        }
    }
}

