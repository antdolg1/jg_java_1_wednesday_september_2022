package students.student_ilja_morozovs.lesson_7.homework.level_1.Task_2;

import java.util.Arrays;

class WordService {
    protected String text = "dim dom dm dom dom";
    protected int maxCount = 0;


    public static void main(String[] args) {
        WordService wordService = new WordService();
        System.out.println(wordService.findMostFrequentWord(wordService.text));
    }

    String findMostFrequentWord(String text) {
        String[] str = text.split(" ");  /*Создаем строковый массив. Где КАЖДОЕ слово является элементом массива.
                                                Разделителем является метод "split" c с параметром " "!!!*/
        System.out.println(Arrays.toString(str));
        int[] howMany = new int[str.length];   // создаем int массив длинной равной количеству слов в строковом массиве.
        wordsEqual(str, howMany);
        int index = wordsGreatestRepetition(howMany, maxCount);
        return str[index];
    }

    void wordsEqual(String[] str, int[] howMany) {
        for (int i = 0; i < str.length; i++) {
            for (String neighWord : str) {
                if (str[i].equals(neighWord)) {
                    howMany[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(howMany));
    }

    int wordsGreatestRepetition(int[] howMany, int maxCount) {
        int wordIndex = 0;
        for (int i = 0; i < howMany.length; i++) {
            if (howMany[i] > maxCount) {
                maxCount = howMany[i];
                wordIndex = i;
            }
        }
        return wordIndex;
    }
}
