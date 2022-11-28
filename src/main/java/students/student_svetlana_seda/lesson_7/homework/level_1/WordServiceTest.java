package students.student_svetlana_seda.lesson_7.homework.level_1;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWordTest();
    }

    public void findMostFrequentWordTest() {
        WordService wordService = new WordService();
        String text = "I love love this this homework.";
        String expectedResult = "love";
        String realResult = wordService.findMostFrequentWord(text);
        System.out.println(text);
        System.out.println("Most frequent word = " + wordService.findMostFrequentWord(text));
        if (expectedResult.equals(realResult)) {
            System.out.println("Frequent word Test = OK");
        } else {
            System.out.println("Frequent word Test = FAIL");
        }
    }

}
