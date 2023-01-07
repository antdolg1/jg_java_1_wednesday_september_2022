package students.student_oskars_popens.lesson_7.level_1_intern;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.positiveResult();
        wordServiceTest.negativeResult();
        wordServiceTest.wordCountTest();
    }

    void wordCountTest(){
        WordService wordService = new WordService();
        String[] text = {"aa","bb","ccc","bbc","bb","aa","aa"};
        String wordToCheck = "aa";
        int expectedCount = 3;
        checkTestResult(wordService.countWordInStringArray(text, wordToCheck)==expectedCount, "Word count test:");
    }
    void positiveResult() {
        WordService wordService = new WordService();
        String text = "aa bb ccc bbc bb aa aa";
        String expectedResult = "aa";
        checkTestResult(wordService.findMostFrequentWord(text).equals(expectedResult), "Positive test:");
    }

    void negativeResult() {
        WordService wordService = new WordService();
        String text = "aa bb ccc bbc bb aa aa";
        String expectedResult = "bb";
        checkTestResult(!wordService.findMostFrequentWord(text).equals(expectedResult), "Negative test:");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
