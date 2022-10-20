package students.student_ignat_parfenov.lesson_4.lessoncode;

public class HumanAgeClassifierTest {

    public static void main(String[] args) {

        HumanAgeClassifierTest test = new HumanAgeClassifierTest();
        test.shouldClassifyBaby();
    }

    void shouldClassifyBaby() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = 11;
        String expectedResult = "Baby";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldClassifyBaby IS PASSED! ");
        } else {
            System.out.println("Test shouldClassifyBaby is FAILED");
            System.out.println("Expected result " + expectedResult + "\nbut actual result " + actualResult);
        }

    }
}
