package students.student_stivens_veveris.lesson3.level7;

public class CarDemo {

    public static void main(String[] args) {

        Car firstCar = new Car();
        firstCar.name = "Mitsubishi";
        firstCar.year = 2008;
        firstCar.isNew = false;
        firstCar.color = "red";

        System.out.println("First car name is: " + firstCar.name);
        System.out.println("First car year is: " + firstCar.year);
        System.out.println("First car is new: " + firstCar.isNew);
        System.out.println("First car color is: " + firstCar.color);
        System.out.println("--------------------------------------");

        Car secondCar = new Car("Volvo", 2022, true, "white");

        System.out.println("Second car name is: " + secondCar.name);
        System.out.println("Second car year is: " + secondCar.year);
        System.out.println("Second car is new: " + secondCar.isNew);
        System.out.println("Second car color is: " + secondCar.color);
        System.out.println("--------------------------------------");

        Car thirdCar = new Car("BMW", 2002, false, "black");

        System.out.println("Third car name is: " + thirdCar.name);
        System.out.println("Third car year is: " + thirdCar.year);
        System.out.println("Third car is new: " + thirdCar.isNew);
        System.out.println("Third car color is: " + thirdCar.color);
        System.out.println("--------------------------------------");



    }
}