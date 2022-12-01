package students.student_zanna_klimova.lesson_7.level1;

public class WordService {
    public String findMostFrequentWord(String text) {

        int maxCount = 0;
        int index = 0;
        String[] words = text.split(" ");

        int[] howMany = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (String mostFrequentWord : words) {
                if (words[i].equals(mostFrequentWord)) {
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
        System.out.println("The most frequent word is: " + words[index]);
        return words[index];
    }
}

/*
        int countWord = 0;
        String[] str = text.split(" ");
        System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
        for (int j = i + 1; j < str.length; j++) {
        if (str[i].equals(str[j])) {
        countWord[i]++;
        }
        }
        }

        return text;*/