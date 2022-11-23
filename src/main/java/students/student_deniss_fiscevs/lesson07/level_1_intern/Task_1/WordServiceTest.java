package students.student_deniss_fiscevs.lesson07.level_1_intern.Task_1;

import java.util.Arrays;

class WordServiceTest {

    String text = "Coding language Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need to recompile. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most popular programming languages in use according to GitHub, particularly for client–server web applications, with a reported 9 million developers.";

    String[] splittedText = {"coding", "language", "java", "is", "a", "highlevel", "classbased", "objectoriented", "programming", "language", "that", "is", "designed", "to", "have", "as", "few", "implementation", "dependencies", "as", "possible", "it", "is", "a", "generalpurpose", "programming", "language", "intended", "to", "let", "programmers", "write", "once", "run", "anywhere", "wora", "meaning", "that", "compiled", "java", "code", "can", "run", "on", "all", "platforms", "that", "support", "java", "without", "the", "need", "to", "recompile", "java", "applications", "are", "typically", "compiled", "to", "bytecode", "that", "can", "run", "on", "any", "java", "virtual", "machine", "jvm", "regardless", "of", "the", "underlying", "computer", "architecture", "the", "syntax", "of", "java", "is", "similar", "to", "c", "and", "c", "but", "has", "fewer", "lowlevel", "facilities", "than", "either", "of", "them", "the", "java", "runtime", "provides", "dynamic", "capabilities", "such", "as", "reflection", "and", "runtime", "code", "modification", "that", "are", "typically", "not", "available", "in", "traditional", "compiled", "languages", "as", "of", "java", "was", "one", "of", "the", "most", "popular", "programming", "languages", "in", "use", "according", "to", "github", "particularly", "for", "clientserver", "web", "applications", "with", "a", "reported", "million", "developers" };

    String expectedFrequentWord = "java";

    public static void main(String[] args) {

        String text = "Coding language Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need to recompile. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most popular programming languages in use according to GitHub, particularly for client–server web applications, with a reported 9 million developers.";

        WordService wordService = new WordService();
        String searchingWord = wordService.findMostFrequentWord(text);
        System.out.println("The most frequent word is \"" + searchingWord + "\"!");
        System.out.println("_________________________________");

        WordServiceTest test = new WordServiceTest();
        test.theFinalResultTest();
        test.isAllWordsInArrayAreInLowerCaseTest();
        test.wordsMatchingCounterTest();
        test.wordsFrequencyCounterTest();
    }

    void theFinalResultTest() {
        WordService victim = new WordService();
        String actualResult = victim.findMostFrequentWord(text);
        if (expectedFrequentWord.equals(actualResult)) {
            System.out.println("MAIN TEST: find most frequent word in whole text test - OK");
        } else {
            System.out.println("MAIN TEST: find most frequent word in whole text test - FAIL");
        }
    }

    void isAllWordsInArrayAreInLowerCaseTest() {
        WordService victim = new WordService();
        String[] expectedResult = splittedText;
        String[] actualResult = victim.makeTextToLowerCaseAndSplitIt(text);
        if (Arrays.toString(expectedResult).equals(Arrays.toString(actualResult))) {
            System.out.println("Convert text to lower case test - OK");
        } else {
            System.out.println("Convert text to lower case test - FAIL");
        }
    }

    void wordsMatchingCounterTest() {
        WordService victim = new WordService();
        int expectedResult = 8;
        int actualResult = victim.countMatchingWords(splittedText, expectedFrequentWord);
        if (actualResult == expectedResult) {
            System.out.println("Word's matching TEST - OK");
        } else {
            System.out.println("Word's matching TEST - FAIL");
        }
    }

    void wordsFrequencyCounterTest() {
        WordService victim = new WordService();
        String expectedResult = expectedFrequentWord;
        String actualResult = victim.countingWordsFrequency(splittedText);
        if (actualResult.equals(expectedResult)) {
            System.out.println("Word's frequency TEST - OK");
        } else {
            System.out.println("Word's frequency TEST - FAIL");
        }
    }
}