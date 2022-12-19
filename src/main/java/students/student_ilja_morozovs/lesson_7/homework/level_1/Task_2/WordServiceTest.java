package students.student_ilja_morozovs.lesson_7.homework.level_1.Task_2;

import java.util.Arrays;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.testResult(wordServiceTest.wordsEqualTest());
        wordServiceTest.testResult(wordServiceTest.wordsGreatestRepetitionTest());
    }

    void testResult(boolean condition) {
        if (condition) {
            System.out.println("Test is: OK");
        } else {
            System.out.println("Test is: FAIL");
        }
    }

    boolean wordsEqualTest() {
        WordService wordService = new WordService();
        String[] strTarget = {"Riga", "Roga", "Roga"};
        int[] howManyTarget = {1, 2, 2};
        int[] howMany = new int[strTarget.length];
        wordService.wordsEqual(strTarget, howMany);
        return Arrays.equals(howManyTarget, howMany);
    }

    boolean wordsGreatestRepetitionTest() {
        WordService wordService = new WordService();
        int[] howManyTarget = {3, 3, 2};
        boolean condition = false;
        int maxCount = 0;
        int firstMaxCountIndexInArray = 1;
        int wordIndexRealResult = wordService.wordsGreatestRepetition(howManyTarget, maxCount);
        if (wordIndexRealResult == firstMaxCountIndexInArray) {
            condition = true;
        }
        return condition;
    }
}
