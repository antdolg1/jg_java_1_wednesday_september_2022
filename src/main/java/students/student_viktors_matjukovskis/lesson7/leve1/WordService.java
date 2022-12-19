package students.student_viktors_matjukovskis.lesson7.leve1;

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
        System.out.println("Frequent word: " + words[index]);
        return words[index];
    }

}
