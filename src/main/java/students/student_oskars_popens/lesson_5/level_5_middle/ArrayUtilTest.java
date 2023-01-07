package students.student_oskars_popens.lesson_5.level_5_middle;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray(){
        int expetedLenght = 3;
        int[] myArray;
        myArray = ArrayUtil.createArray(3);
        int currentLength = myArray.length;

        if (expetedLenght == currentLength){
            System.out.println("Test create array = OK");
        }
        else {
            System.out.println("Test create array = FALSE");
        }
    }
}
