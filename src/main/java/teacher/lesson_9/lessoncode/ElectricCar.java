package teacher.lesson_9.lessoncode;

public class ElectricCar extends Car{

    private int batteryCapacity;

    public ElectricCar(String model, int batteryCapacity) {
        super(model);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void start() {
        if (batteryCapacity > 0) {
            System.out.println("Accumulator switched ON!");
            batteryCapacity--;
        } else {
            System.out.println("Accumulator is empty! Please charge!");
        }
    }

    @Override
    public void stop() {
        System.out.println("Accumulator switched OFF!");
    }

    @Override
    public boolean updateSystem() {
        if (batteryCapacity > 0) {
            System.out.println("Update computer system!");
            batteryCapacity--;
            return true;
        } else {
            System.out.println("Accumulator is empty! Please charge!");
            return false;
        }
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "model=" + getModel() + ", " +
                "batteryCapacity=" + batteryCapacity +
                '}';
    }
}
