package teacher.lesson_4.lessoncode;

public class HumanAgeClassifierTest {

    public static void main(String[] args) {

        HumanAgeClassifierTest test = new HumanAgeClassifierTest();
        test.shouldClassifyBaby();
        test.shouldClassifyTeenager();
        test.shouldClassifyUndead();
    }

    void shouldClassifyBaby() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = 2;
        String expectedResult = "Baby";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldClassifyBaby PASSED!");
        } else {
            System.out.println("Test shouldClassifyBaby FAILED!");
            System.out.println("Expected result: " + expectedResult + "\nActual result: " + actualResult);
        }
    }

    void shouldClassifyTeenager() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = 14;
        String expectedResult = "Teenager";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldClassifyTeenager PASSED!");
        } else {
            System.out.println("Test shouldClassifyTeenager FAILED!");
            System.out.println("Expected result: " + expectedResult + "\nActual result: " + actualResult);
        }
    }

    void shouldClassifyUndead() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = 100000;
        String expectedResult = "Undead";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldClassifyUndead PASSED!");
        } else {
            System.out.println("Test shouldClassifyUndead FAILED!");
            System.out.println("Expected result: " + expectedResult + "\nActual result: " + actualResult);
        }
    }

}
