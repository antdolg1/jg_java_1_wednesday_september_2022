package teacher.lesson_5.lessoncode;

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

//        System.out.println("Arrays vehicles length is: " + vehicles.length);
//        System.out.println("Arrays vehicles2 length is: " + vehicles2.length);
//
//        System.out.println("Under index 2 in array vehicles is: " + vehicles[2]);
//        System.out.println("Under index 2 in array vehicles2 is: " + vehicles2[2]);

//        for(int i = 0; i < vehicles.length; i++) {
//            System.out.println("[" + i + "]" + " = " + vehicles[i]);
//        }

//        for(String vehiclesElement : vehicles) {
//            System.out.println(vehiclesElement);
//        }

        int[] numbers = {1, 2, 3, 4, 5};
//        int sumNumbers = 0;
//
//        for(int number : numbers) {
//            sumNumbers = sumNumbers + number;
////            sumNumbers += number;
//        }

//        System.out.println("Sum of all numbers in numbers[] is: " + sumNumbers);


        int[] numbers2 = {12, 16, 33, -2, 3, 5, 64, -98};

        int sum = CustomArrayUtils.sumOfArrayNumbers(numbers2);
        System.out.println("Sum of array numbers2 is: " + sum);

        int minNumber = CustomArrayUtils.minNumberInArray(numbers2);
        System.out.println("Min number of array number2 is: " + minNumber);

        int maxNumber = CustomArrayUtils.maxNumberInArray(numbers2);
        System.out.println("Max number of array number2 is: " + maxNumber);
    }

}
