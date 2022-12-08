package students.student_viktors_matjukovskis.lesson6;

public class Task_6_test {

    public static void main(String[] args) {

        Task_6 testNumberUtils = new Task_6();
        boolean isEven = testNumberUtils.isEven(99);
        if (isEven) {
            System.out.println("Ok");
        } else {
            System.out.println("Test Fail");
        }
    }
}
