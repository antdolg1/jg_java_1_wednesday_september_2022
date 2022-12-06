package students.student_raivis_urbevics.lesson5_level2.task14;

class AverageArrayOfThreeNumbers {
           public static void main(String[] args) {
            int[]numbers=new int[3];
            numbers[0] = ((int)(Math.random()*100));
            numbers[1] = ((int)(Math.random()*100));
            numbers[2] = ((int)(Math.random()*100));
               System.out.println(numbers[0]);
               System.out.println(numbers[1]);
               System.out.println(numbers[2]);

               int averageNumber=(numbers[0]+numbers[1]+numbers[2])/3;
               System.out.println("Average number of three numbers = " + averageNumber );
           }
}
