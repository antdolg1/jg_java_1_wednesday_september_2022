package students.student_svetlana_seda.lesson_7.homework.level_1;

import java.util.Arrays;

class WordService {

    public String text = "I love love this this homework.";

    public String findMostFrequentWord(String text) {
        int maxCount = 0;
        int index = 0;
        String[] words = text.split(" ");
        System.out.println("Splitted words in my array -  " + Arrays.toString(words));

        int[] howMany = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (String frequentWord : words) {
                if (words[i].equals(frequentWord)) {
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
        return words[index];
    }

}








