package students.student_raivis_urbevics.lesson5_level4.task30;

        class OddNumbersOfArray {
            public static void main(String[] args) {
                int[] numbers = new int[8];
                numbers[0] = 43;
                numbers[1] = 65;
                numbers[2] = 76;
                numbers[3] = 34;
                numbers[4] = 78;
                numbers[5] = 53;
                numbers[6] = 75;
                numbers[7] = 89;
                System.out.println(numbers[0]);
                System.out.println(numbers[1]);
                System.out.println(numbers[2]);
                System.out.println(numbers[3]);
                System.out.println(numbers[4]);
                System.out.println(numbers[5]);
                System.out.println(numbers[6]);
                System.out.println(numbers[7]);

                System.out.println(          );


                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 !=0) {
                        System.out.println(numbers[i]);
                    }
                }
            }
        }
