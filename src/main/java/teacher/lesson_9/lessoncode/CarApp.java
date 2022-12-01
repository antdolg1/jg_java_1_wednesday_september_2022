package teacher.lesson_9.lessoncode;

public class CarApp {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar("Tesla", 100);
        String electricCarInfo = electricCar.toString();
        System.out.println(electricCarInfo);

        PetrolCar petrolCar = new PetrolCar("VW Golf");
        petrolCar.start();
        petrolCar.updateSystem();
        petrolCar.stop();
        System.out.println("__________");

        electricCar.start();
        System.out.println(electricCar);
        electricCar.updateSystem();
        System.out.println(electricCar);
        electricCar.setBatteryCapacity(0);
        System.out.println(electricCar);
        electricCar.updateSystem();
        System.out.println("___________");

        Car car1 = new ElectricCar("Tesla 2", 100);
        Car car2 = new ElectricCar("Tesla 3", 100);
        Car car3 = new PetrolCar("BMW");

        Car[] cars = new Car[3];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;

        for (Car car : cars) {
            car.start();
        }

    }

}
