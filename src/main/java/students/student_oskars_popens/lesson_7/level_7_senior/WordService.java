package students.student_oskars_popens.lesson_7.level_7_senior;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] textArray = text.split(" ");

        return mostFreqWordInArray(textArray);
    }

    private String mostFreqWordInArray(String[] array) {
        String returnWord=new String("");
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = wordCount(array, array[i]);
            if (maxCount < count) {
                maxCount = count;
                returnWord = array[i];
            }
        }
        return returnWord;
    }

    private int wordCount(String[] wordArray, String word) {
        int wordCounter = 0;

        for (String s : wordArray) {
            if (word.equals(s)) {
                wordCounter++;
            }
        }
        return wordCounter;
    }
}