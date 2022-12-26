package students.student_sergejs_kozinecs.lesson_7.level_1.Task_3;

public class WordServiceTest {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        WordServiceTest test = new WordServiceTest();

        test.singleRepeateTest(wordService);
        test.multipleRepeateTest(wordService);
    }

    void singleRepeateTest(WordService wordService) {
        String text = "Text with one one repeated word";
        String expectedResult = "one";

        if (wordService.findMostFrequentWord(text).equals(expectedResult)) {
            System.out.println("Test single repeate = OK");
        } else {
            System.out.println("Test single repeate = FAIL");
        }
    }

    void multipleRepeateTest(WordService wordService) {
        String text = "Text with multiple multiple test test one one repeated word";
        String expectedResult = "multiple";

        if (wordService.findMostFrequentWord(text).equals(expectedResult)) {
            System.out.println("Test multiple repeate = OK");
        } else {
            System.out.println("Test multiple repeate = FAIL");
        }
    }
}
