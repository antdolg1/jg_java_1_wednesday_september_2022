package students.student_zanna_klimova.lesson_3.level_4;

import students.student_deniss_fiscevs.lesson03.level_4_junior.Car;

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
