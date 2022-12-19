package students.student_ilja_morozovs.lesson_7.homework.level_1.Task_1;

import java.util.Arrays;

class WordServise {
    String text = "dim dam dam dom dom";

    public static void main(String[] args) {
        WordServise wordServise = new WordServise();
        System.out.println(wordServise.findMostFrequentWord(wordServise.text));
    }

    public String findMostFrequentWord(String text) {
        int maxCount = 0;
        int index = 0;
        String[] str = text.split(" ");  /*Создаем строковый массив. Где КАЖДОЕ слово является элементом массива.
                                                Разделителем является метод "split" c с параметром " "!!!*/
        System.out.println(Arrays.toString(str));
        int[] howMany = new int[str.length];   // создаем int массив длинной равной количеству слов в строковом массиве.
        for (int i = 0; i < str.length; i++) {
            for (String neighWord : str) {
                if (str[i].equals(neighWord)) {
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
        return str[index];
    }
}
