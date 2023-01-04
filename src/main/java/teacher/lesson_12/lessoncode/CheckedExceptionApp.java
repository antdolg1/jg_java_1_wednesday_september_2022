package teacher.lesson_12.lessoncode;

public class CheckedExceptionApp {

    public static void main(String[] args) {

        try {
            shouldThrowException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally block!");
        }
    }

    public static void shouldThrowException() throws Exception {
        throw new Exception("Our first test exception was thrown!!!");
    }

}
