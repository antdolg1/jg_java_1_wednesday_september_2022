package students.student_oskars_popens.lesson_7.level_6_middle;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.shouldBePalindrome();
        test.shouldNotBePalindrome();
    }

    void shouldBePalindrome(){
        Palindrome palindrome = new Palindrome();
        String testString = "sum summus mus";
        checkTestResult(palindrome.isPalindrome(testString), "Is palindrome test:");
    }

    void shouldNotBePalindrome(){
        Palindrome palindrome = new Palindrome();
        String testString = "А роза упала на лапу Азора";
        checkTestResult(!palindrome.isPalindrome(testString), "Is palindrome test:");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
