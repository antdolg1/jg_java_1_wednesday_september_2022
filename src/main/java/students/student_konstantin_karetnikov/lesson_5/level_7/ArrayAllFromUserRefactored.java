package students.student_konstantin_karetnikov.lesson_5.level_7;




class ArrayAllFromUserRefactored {
    public static void main(String[] args) {
        new ArrayUtil();
        int arrayLength = ArrayUtil.getArrayLengthFromUser();
        int [] array =  ArrayUtil.newArray(arrayLength);
        ArrayUtil.fillArray(array);
        ArrayUtil.printArray(array);
        }
    }

