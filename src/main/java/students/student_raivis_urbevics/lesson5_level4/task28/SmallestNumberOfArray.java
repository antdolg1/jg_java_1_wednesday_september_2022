package students.student_raivis_urbevics.lesson5_level4.task28;

     class SmallestNumberOfArray {
         public static void main(String[] args) {
             int[] numbers = new int[4];
             numbers[0] = 54;
             numbers[1] = 34;
             numbers[2] = 65;
             numbers[3] = 63;
             System.out.println(numbers[0]);
             System.out.println(numbers[1]);
             System.out.println(numbers[2]);
             System.out.println(numbers[3]);

             int minNumber = numbers[0];
             for (int i = 0; i < numbers.length; i++) {
                 if (numbers[i] < minNumber) {
                     minNumber = numbers[i];
                 }
             }
                 System.out.println("Min number is " + minNumber);
             }
         }
