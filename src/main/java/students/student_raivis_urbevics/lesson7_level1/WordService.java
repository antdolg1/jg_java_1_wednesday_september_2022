package students.student_raivis_urbevics.lesson7_level1;

import java.util.Arrays;

class WordService {

    String text = "Hello, let me show you the new game This game will improve your reaction.";

    public static void main(String[] args) {
        WordService wordService = new WordService();
        System.out.println("Most frequent word = " + wordService.findMostFrequentWord(wordService.text));

    }

    public String findMostFrequentWord(String text) {
        int maxCount = 0;
        int index = 0;
        String[] w = text.split(" ");

        int[] howMany = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            for (String mostWord : w) {
                if (w[i].equals(mostWord)) {
                    howMany[i]++;
                }
            }
        }
        for (int i = 0; i < howMany.length; i++) {
            if (howMany[i] > maxCount) {
                maxCount = howMany[i];
                index = i;
            }
        }
        return w[index];
    }
}
