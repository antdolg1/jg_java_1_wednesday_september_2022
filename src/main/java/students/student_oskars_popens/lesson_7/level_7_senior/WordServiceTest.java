package students.student_oskars_popens.lesson_7.level_7_senior;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.shouldFindMostFrequentWord();
        test.shouldNotFindMostFrequentWord();
    }

    private void shouldFindMostFrequentWord() {
        WordService wordService = new WordService();
        String text = new String("aaa bbb ccc ddd cccc ddd aaaa ccc bbb bbb aaaa wwwewr");
        String expectedResult = "bbb";
        checkResult(expectedResult.equals(wordService.findMostFrequentWord(text)), "Find most frequent word in string");
    }

    private void shouldNotFindMostFrequentWord() {
        WordService wordService = new WordService();
        String text = new String("aaa bbb ccc ddd cccc ddd aaaa ccc bbb bbb aaaa wwwewr");
        String expectedResult = "ccc";
        checkResult(!expectedResult.equals(wordService.findMostFrequentWord(text)), "Not find most frequent word in string");
    }

    private void checkResult(boolean result, String testName) {
        if (result) {
            System.out.printf("%s : Test Ok\n", testName);
        } else {
            System.out.printf("%s : Test FAIL\n", testName);
        }
    }
}
