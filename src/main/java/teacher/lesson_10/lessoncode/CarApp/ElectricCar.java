package teacher.lesson_10.lessoncode.CarApp;

public class ElectricCar extends Car implements CarWorkshop {

    private int batteryCapacity;

    public ElectricCar(String model, int power, int batteryCapacity) {
        super(model, power);
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
            printEmptyBatteryInfo();
            chargeBattery();
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

    @Override
    public void increasePower(int increaseAmount) {
        if (batteryCapacity > 0) {
            int currentPower = getPower();
            setPower(currentPower + increaseAmount);
            batteryCapacity -= 100;
//            batteryCapacity = batteryCapacity - 100;
        } else {
            printEmptyBatteryInfo();
            chargeBattery();
        }
    }

    private void printEmptyBatteryInfo() {
        System.out.println("Battery of car " + getModel() + " is empty! Please charge!");
    }

    private void chargeBattery() {
        if (batteryCapacity <= 0) {
            System.out.println("Charging started >>>");
            System.out.println("Charging...20%");
            System.out.println("Charging...40%");
            System.out.println("Charging...60%");
            System.out.println("Charging...80%");
            System.out.println("Charging...100%");
            batteryCapacity = 100;
        } else {
            System.out.println("No need to charge the battery!");
        }
    }
}
