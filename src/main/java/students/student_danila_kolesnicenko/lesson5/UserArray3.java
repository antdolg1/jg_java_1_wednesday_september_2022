package students.student_danila_kolesnicenko.lesson5;

class UserArray3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 67);
            System.out.println(array[i]);
        }
        int maxNum = array[4];

//        for (int number : array) {
//            if (number > maxNum)
//                maxNum = number;
//        }
        for (int i = 0;i < array.length; i++){
            if (array[i] > maxNum ){
                maxNum = array[i];
            }
        }

        System.out.println("Max number is: " + maxNum);
    }
}
