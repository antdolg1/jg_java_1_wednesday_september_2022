package students.student_raivis_urbevics.lesson7_level1;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWordTest();
    }

    public void findMostFrequentWordTest() {
        WordService wordService = new WordService();
        String text = "beautiful car fast car comfortable car";
        String expectedResult = "car";
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
