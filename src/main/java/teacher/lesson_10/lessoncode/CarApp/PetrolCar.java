package teacher.lesson_10.lessoncode.CarApp;

public class PetrolCar extends Car implements CarWorkshop, CarWash{

    private boolean clean;

    public PetrolCar(String model, int power) {
        super(model, power);
        this.clean = true;
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

    @Override
    public void increasePower(int increaseAmount) {
        int currentPower = getPower();
        System.out.println("Car " + getModel() + " power before upgrade - " + currentPower);
        setPower(currentPower + increaseAmount);
        System.out.println("Car " + getModel() + " power after upgrade - " + getPower());
        clean = false;
    }

    @Override
    public void washCar() {
        if (clean) {
            System.out.println("Car is clean, no need to wash it!");
        } else {
            System.out.println("Starting car wash!");
            System.out.println("...");
            System.out.println("Car was complete!");
            clean = true;
        }
    }
}
