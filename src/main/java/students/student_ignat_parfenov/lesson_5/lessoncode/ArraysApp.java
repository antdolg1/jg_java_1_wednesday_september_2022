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

    }
}
