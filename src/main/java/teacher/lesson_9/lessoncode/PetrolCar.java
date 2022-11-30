package teacher.lesson_9.lessoncode;

public class PetrolCar extends Car{

    public PetrolCar(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println("Start petrol engine!");
    }

    @Override
    public void stop() {
        System.out.println("Stop petrol engine!");
    }

    @Override
    public boolean updateSystem() {
        System.out.println("Update computer system!");
        return true;
    }
}
