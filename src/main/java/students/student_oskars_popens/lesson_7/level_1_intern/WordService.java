package students.student_oskars_popens.lesson_7.level_1_intern;

class WordService {
    public String findMostFrequentWord(String text){
        String[] arrayOfWords = text.split("[, ?.@]+");
        int wordCount=0;
        String mostFreqWord="";
        for (String word : arrayOfWords ) {
            int currentWordCount=countWordInStringArray(arrayOfWords,word);
            if (wordCount < currentWordCount){
                wordCount = currentWordCount;
                mostFreqWord = word;
            }
        }
        return mostFreqWord;
    }

    public int countWordInStringArray(String[] wordsInText, String wordToCheck){
        int count = 0;
        for (String word:wordsInText) {
            if (word.equals(wordToCheck)){
                count++;
            }
        }
        return count;
    }
}
