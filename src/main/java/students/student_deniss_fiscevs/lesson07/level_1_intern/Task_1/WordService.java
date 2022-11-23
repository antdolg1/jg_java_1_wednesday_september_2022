package students.student_deniss_fiscevs.lesson07.level_1_intern.Task_1;


class WordService {

    public String findMostFrequentWord(String text) {

        String[] filteredWords = makeTextToLowerCaseAndSplitIt(text);
        String searchingWord = countingWordsFrequency(filteredWords);

        return searchingWord;
    }

    public String[] makeTextToLowerCaseAndSplitIt(String text) {

        text = text.toLowerCase();
        text = text.replaceAll("[^a-z ]", "");
        String[] words = text.split(" +");

        return words;
    }

    public int countMatchingWords(String[] wordsArray, String searchingWord) {

        int searchingCount = 0;
        for (String checkingWord : wordsArray) {
            if (searchingWord.equals(checkingWord)) {
                searchingCount++;
            }
        }
        return searchingCount;
    }

    public String countingWordsFrequency(String[] words) {

        int frequentWord = 0;
        String frequentWordsName = "";

        for (String searchingWord : words) {
            int searchingCount = countMatchingWords(words, searchingWord);
            if (frequentWord < searchingCount) {
                frequentWord = searchingCount;
                frequentWordsName = searchingWord;
            }
        }
        return frequentWordsName;
    }
}