package students.student_oskars_popens.lesson_7.level_1_intern;

class WordServiceDemo {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String text="aaa bb cc aa bb dd ee qq rrr tttt  yyy .dd.ss.assfgrtkij,aaa aaa";
        String mostFreqWord = wordService.findMostFrequentWord(text);
        System.out.printf("Most frequented wortd in string [%s] is [%s]\n", text, mostFreqWord);
    }
}
