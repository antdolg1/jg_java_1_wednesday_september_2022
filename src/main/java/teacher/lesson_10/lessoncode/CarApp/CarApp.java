package teacher.lesson_10.lessoncode.CarApp;

public class CarApp {

    public static void main(String[] args) {

//        PetrolCar petrolCar = new PetrolCar("Audi", 100);
//        petrolCar.washCar();
//        petrolCar.increasePower(50);
//        petrolCar.washCar();

        ElectricCar electricCar = new ElectricCar("Tesla 1", 200, 100);
        electricCar.increasePower(25);
        electricCar.updateSystem();


    }
}
