package students.student_svetlana_seda.lesson_7.homework.level_1;

import students.student_svetlana_seda.lesson_7.homework.level_1.WordService;

class WordServiceDemo {

    public static void main(String[] args) {

        String text = "I love love this this homework.";
        System.out.println("My text is " + text);
        WordService wordService = new WordService();

        System.out.println("The first frequent word in the text is " + wordService.findMostFrequentWord(wordService.text) + "!");
    }

}
