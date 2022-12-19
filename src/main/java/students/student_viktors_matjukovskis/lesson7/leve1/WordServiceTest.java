package students.student_viktors_matjukovskis.lesson7.leve1;

public class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWordTestOk();
        wordServiceTest.findMostFrequentWordTestFail();
    }

    public void findMostFrequentWordTestOk() {
        WordService wordService = new WordService();
        String text = "Find the same words.)";
        String expectedResult = "text";
        String realResult = wordService.findMostFrequentWord(text);
        System.out.println(text);
        System.out.println("Most frequent word = " + wordService.findMostFrequentWord(text));
        if (expectedResult.equals(realResult)) {
            System.out.println("Find most frequent word Test = OK");
        } else {
            System.out.println("Find most frequent word Test = FAIL");
        }
    }

    public void findMostFrequentWordTestFail() {
        WordService wordService = new WordService();
        String text = "Find the same words.)";
        String expectedResult = "please";
        String realResult = wordService.findMostFrequentWord(text);
        System.out.println(text);
        System.out.println("Most frequent word = " + wordService.findMostFrequentWord(text));
        if (expectedResult.equals(realResult)) {
            System.out.println("Find most frequent word Test = OK");
        } else {
            System.out.println("Find most frequent word Test = FAIL");
        }
    }

}
