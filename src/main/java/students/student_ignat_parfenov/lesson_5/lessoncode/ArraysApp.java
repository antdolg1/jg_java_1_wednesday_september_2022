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
    }
}
