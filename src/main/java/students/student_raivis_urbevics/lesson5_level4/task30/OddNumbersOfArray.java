package students.student_raivis_urbevics.lesson5_level4.task30;

         class OddNumbersOfArray {
            public static void main(String[] args) {
                int[] numbers = new int[8];
                numbers[0] = ((int)(Math.random()*100));
                numbers[1] = ((int)(Math.random()*100));
                numbers[2] = ((int)(Math.random()*100));
                numbers[3] = ((int)(Math.random()*100));
                numbers[4] = ((int)(Math.random()*100));
                numbers[5] = ((int)(Math.random()*100));
                numbers[6] = ((int)(Math.random()*100));
                numbers[7] = ((int)(Math.random()*100));
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
