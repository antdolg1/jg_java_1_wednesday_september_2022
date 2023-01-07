package students.student_oskars_popens.lesson_7.level_6_middle;

class Palindrome {
    boolean isPalindrome(String text) {
        char[] charArray = textToArray(text);
        char[] revertedCharArray = revertCharArray(charArray);
        return compareCharArrays(charArray, revertedCharArray);
    }

    char[] textToArray(String text){
        char[] charArray = new char[text.length()];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i]=text.toLowerCase().charAt(i);
        }
        return charArray;
    }
    char[] revertCharArray(char[] array) {
        char[] returnArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            returnArray[i] = array[array.length - 1 - i];
        }
        return returnArray;
    }

    boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i])
            {
                return false;
            }
        }

        return true;
    }
}
