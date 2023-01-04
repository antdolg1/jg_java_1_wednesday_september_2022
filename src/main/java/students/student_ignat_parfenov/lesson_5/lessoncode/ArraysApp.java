package students.student_ignat_parfenov.lesson_5.lessoncode;

public class ArraysApp {

    public static void main(String[] args) {

        String[] vehicles = new String[5];

        vehicles[0] = "Car";
        vehicles[1] = "Bus";
        vehicles[2] = "Bicycle";
        vehicles[3] = "Motorbike";
        vehicles[4] = "Truck";

        String[] vehicles2 = {"Car", "Bus", "Truck"};

        CustomArrayUtils.printArrayToConsole(vehicles);

        System.out.println("Arrays vehicles length " + vehicles.length);
        System.out.println("Arrays vehicles length " + vehicles2.length);

        System.out.println("Under index 2 in array vehicle is: " + vehicles[2]);
        System.out.println("Under index 2 in array vehicle2 is: " + vehicles2[2]);

//        for (int i = 0; i < vehicles.length; i++) {
//            System.out.println("[" + i + "] " + "= " + vehicles[i]);
//        }

        for (String vehiclesElement : vehicles) {
            System.out.println(vehiclesElement);
        }

        int[] numbers = {1, 2, 3, 4, 5};
        int sumNumbers = 0;

        CustomArrayUtils.sumOfArrayNumbers(numbers);

        for (int number : numbers) {
            sumNumbers += number;
        }
        System.out.println("Sum of all numbers = " + sumNumbers);

        int[] numbers2 = {95, 221, 3, 40, -92};


        int sum = CustomArrayUtils.sumOfArrayNumbers(numbers2);
        System.out.println("Sum of all elements of this array is: " + sum);
    }
}
