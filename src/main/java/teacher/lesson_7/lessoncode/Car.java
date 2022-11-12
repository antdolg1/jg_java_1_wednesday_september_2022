package teacher.lesson_7.lessoncode;

import java.util.Objects;

public class Car {

    String model;
    String color;
    int maxSpeed;
    double engineVolume;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Double.compare(car.engineVolume, engineVolume) == 0 && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public String toString() {
        return "Car " +
                "model: '" + model + '\'' +
                ", color: '" + color + '\'' +
                ", maxSpeed: " + maxSpeed +
                ", engineVolume: " + engineVolume;
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "Ford";
        car1.color = "red";
        car1.maxSpeed = 180;
        car1.engineVolume = 1.8;

        Car car2 = new Car();
        car2.model = "VW";
        car2.color = "blue";
        car2.maxSpeed = 220;
        car2.engineVolume = 1.8;

        Car car3 = car1;

        System.out.println("car1 == car3 - " + (car1 == car3));
        System.out.println("car1 == car2 - " + (car1 == car2));
        System.out.println("car1 is equal to car2 - " + car1.equals(car2));

        System.out.println("Car1 model is: " + car1.model + ", color: " + car1.color + ", max speed: " + car1.maxSpeed + ", engine volume: " + car1.engineVolume);
        System.out.println(car1);
        System.out.println(car2);

    }

}
