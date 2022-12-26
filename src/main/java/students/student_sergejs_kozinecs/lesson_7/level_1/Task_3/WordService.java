package students.student_sergejs_kozinecs.lesson_7.level_1.Task_3;

public class WordService {
    public int findHighestNumberIndex(int[] numbers) {
        int highestNumber = 0;
        int highestNumberIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (highestNumber < numbers[i]) {
                highestNumber = numbers[i];
                highestNumberIndex = i;
            }
        }

        return highestNumberIndex;
    }

    public String findMostFrequentWord(String text) {
        if (text.length() < 1)
            return "";

        String[] words = text.split(" ");
        int[] wordCounter = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    wordCounter[i]++;
                }
            }
        }

        return words[findHighestNumberIndex(wordCounter)];
    }
}
