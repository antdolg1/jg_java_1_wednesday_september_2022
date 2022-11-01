package students.student_danila_kolesnicenko.lesson5;

class UserArray4 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 67);
            System.out.println(array[i]);
        }
        int minNum = array[4];

//        for (int numberOfArray : array) {
//            if (numberOfArray < minNum)
//                minNum = numberOfArray;
//        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        System.out.println("Max number is: " + minNum);
    }
}


